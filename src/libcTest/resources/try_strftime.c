#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char **argv) {
  char s[8192];
  struct tm tm;

  if (argc <= 1) {
    fprintf(stderr, "ERROR: no arguments.\n");
    return -1;
  }

  tm.tm_sec = 5;
  tm.tm_min = 4;
  tm.tm_hour = 15;
  tm.tm_mday = 2;
  tm.tm_mon = 1 - 1;
  tm.tm_year = 2006 - 1900;
  tm.tm_wday = 1;  // Monday
  tm.tm_yday = 2 - 1;
  tm.tm_isdst = 0;

  if (strftime(s, sizeof(s) - 1, argv[1], &tm) == 0) {
    fprintf(stderr, "ERROR: strftime returned 0.\n");
    return -1;
  }

  printf("%s\n", s);
  return 0;
}

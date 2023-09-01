def isPalindrome(srt:String): Boolean = {
  srt==srt.reverse
}

def toMakePlindrome(str: String): String = {
  if(isPalindrome(str)){
    str
  }else {
    def canbepallindrome(substr: String): Boolean = {
      substr == substr.reverse
    }

    for (i <- 0 until str.length) {
      val substr = str.patch(i, "", 1)
      if (canbepallindrome(substr)) {
        return substr
      }
    }
    for (i <- 0 until str.length - 1) {
      val substr = str.patch(i, "", 2)
      if (canbepallindrome(substr)) {
        return substr
      }
    }
  }
  "Not possible"
}

isPalindrome("bittib")
toMakePlindrome("bittibbb")

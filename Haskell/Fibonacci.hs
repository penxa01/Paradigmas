
fibonacci :: Integral a => a -> a
fibonacci 1 = 1
fibonacci 0 = 0
fibonacci a = fibonacci (a-2) + fibonacci (a-1)
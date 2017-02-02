## Thread Locking With ReentrantLock & Runnable

An example of a sequenced, multi-threaded application using *ReentrantLock* and the *Runnable* interface.

Two counters, counting in opposite directions, are wrapped in Runnable threads, locked, and sequentially executed through a *try/catch* block.

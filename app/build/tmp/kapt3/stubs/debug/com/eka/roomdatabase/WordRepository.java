package com.eka.roomdatabase;

import java.lang.System;

/**
 * Abstracted Repository as promoted by the Architecture Guide.
 * https://developer.android.com/topic/libraries/architecture/guide.html
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/eka/roomdatabase/WordRepository;", "", "wordDao", "Lcom/eka/roomdatabase/WordDao;", "(Lcom/eka/roomdatabase/WordDao;)V", "allWords", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/eka/roomdatabase/Word;", "getAllWords", "()Lkotlinx/coroutines/flow/Flow;", "insert", "", "word", "(Lcom/eka/roomdatabase/Word;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WordRepository {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.eka.roomdatabase.Word>> allWords = null;
    private final com.eka.roomdatabase.WordDao wordDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.eka.roomdatabase.Word>> getAllWords() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.eka.roomdatabase.Word word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public WordRepository(@org.jetbrains.annotations.NotNull()
    com.eka.roomdatabase.WordDao wordDao) {
        super();
    }
}
package com.facebook.jni;

import java.util.Iterator;
import tb.kge;

/* loaded from: classes4.dex */
public class IteratorHelper {
    private Object mElement;
    private final Iterator mIterator;

    static {
        kge.a(-1004850207);
    }

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}

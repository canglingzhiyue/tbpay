package com.taobao.message.window;

/* loaded from: classes7.dex */
public interface FloatWindowListener {

    /* loaded from: classes7.dex */
    public @interface FloatStatus {
        public static final int CANCEL = 4;
        public static final int CREATE = 2;
        public static final int DESTROY = 3;
        public static final int INVISIBLE = 1;
        public static final int VISIBLE = 0;
    }

    void onClick();

    void onLifecycleChanged(int i);
}

package com.taobao.keepalive;

/* compiled from: lambda */
/* renamed from: com.taobao.keepalive.-$$Lambda$FJ5sH7Q7Neef2XTQdHk-GLN32vs  reason: invalid class name */
/* loaded from: classes7.dex */
public final /* synthetic */ class $$Lambda$FJ5sH7Q7Neef2XTQdHkGLN32vs implements Runnable {
    public static final /* synthetic */ $$Lambda$FJ5sH7Q7Neef2XTQdHkGLN32vs INSTANCE = new $$Lambda$FJ5sH7Q7Neef2XTQdHkGLN32vs();

    private /* synthetic */ $$Lambda$FJ5sH7Q7Neef2XTQdHkGLN32vs() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeepAliveManager.registerScreenReceiver();
    }
}

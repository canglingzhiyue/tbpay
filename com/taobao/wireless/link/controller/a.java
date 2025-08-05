package com.taobao.wireless.link.controller;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.MessageData;
import com.taobao.wireless.link.pop.PopMessageData;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MessageData f23587a;
    public PopMessageData b;
    public MessageData c;
    public MessageData d;
    public Bitmap e;
    public Bitmap f;
    public Bitmap g;
    public Bitmap h;
    public Drawable i;
    public String j;
    public String k;
    public String l;
    public String m;
    private Handler n;

    /* renamed from: com.taobao.wireless.link.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1018a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f23589a;

        static {
            kge.a(-1375062102);
            f23589a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("34f8fd4", new Object[0]) : f23589a;
        }
    }

    static {
        kge.a(-1031725865);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("34f8fd4", new Object[0]) : C1018a.a();
    }

    private a() {
        this.f23587a = new MessageData();
        this.b = new PopMessageData();
        this.n = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.taobao.wireless.link.controller.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
                }
                return false;
            }
        });
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ac18683d", new Object[]{this}) : this.n;
    }
}

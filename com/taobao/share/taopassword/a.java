package com.taobao.share.taopassword;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
import com.taobao.share.taopassword.busniess.model.d;
import tb.kge;
import tb.nzq;
import tb.nzr;
import tb.nzu;
import tb.nzv;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.share.taopassword.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0809a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f19652a;

        static {
            kge.a(1078969921);
            f19652a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f00299d1", new Object[0]) : f19652a;
        }
    }

    static {
        kge.a(860666222);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f00299d1", new Object[0]) : C0809a.a();
    }

    private a() {
    }

    public void a(Context context, ALCreatePassWordModel aLCreatePassWordModel, nzu nzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5ff897", new Object[]{this, context, aLCreatePassWordModel, nzuVar});
            return;
        }
        try {
            nzq.a().a(context, aLCreatePassWordModel, nzuVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(Context context, d dVar, nzv nzvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536f0d59", new Object[]{this, context, dVar, nzvVar});
        } else {
            nzr.a().a(context, dVar, nzvVar);
        }
    }
}

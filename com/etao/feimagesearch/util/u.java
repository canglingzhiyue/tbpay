package com.etao.feimagesearch.util;

import android.app.Activity;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rul;

/* loaded from: classes4.dex */
public final class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f7035a;
    private String b;
    private final boolean c;
    private final ContentObserver d;
    private boolean e;
    private rul<? super String, kotlin.t> f;

    /* loaded from: classes4.dex */
    public static final class a extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Handler handler) {
            super(handler);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1546015465) {
                super.onChange(((Boolean) objArr[0]).booleanValue(), (Uri) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @Override // android.database.ContentObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onChange(boolean r5, android.net.Uri r6) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.util.u.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                if (r1 == 0) goto L1d
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                r1[r3] = r4
                java.lang.Boolean r3 = new java.lang.Boolean
                r3.<init>(r5)
                r1[r2] = r3
                r5 = 2
                r1[r5] = r6
                java.lang.String r5 = "5c2652e9"
                r0.ipc$dispatch(r5, r1)
                return
            L1d:
                super.onChange(r5, r6)
                if (r6 != 0) goto L23
                return
            L23:
                java.util.List r5 = r6.getPathSegments()
                if (r5 == 0) goto L4c
                int r0 = r5.size()
                if (r0 <= 0) goto L4c
                com.etao.feimagesearch.util.u r0 = com.etao.feimagesearch.util.u.this
                int r1 = r5.size()
                int r1 = r1 - r2
                java.lang.Object r5 = r5.get(r1)
                java.lang.String r1 = "segments[segments.size - 1]"
                kotlin.jvm.internal.q.a(r5, r1)
                java.lang.String r5 = (java.lang.String) r5
                boolean r5 = com.etao.feimagesearch.util.u.a(r0, r5)
                if (r5 == 0) goto L4c
                java.lang.String r5 = r6.toString()
                goto L4d
            L4c:
                r5 = 0
            L4d:
                if (r5 != 0) goto L50
                return
            L50:
                com.etao.feimagesearch.util.u r6 = com.etao.feimagesearch.util.u.this
                java.lang.String r6 = com.etao.feimagesearch.util.u.a(r6)
                boolean r6 = kotlin.jvm.internal.q.a(r6, r5)
                if (r6 == 0) goto L5d
                return
            L5d:
                com.etao.feimagesearch.util.u r6 = com.etao.feimagesearch.util.u.this
                com.etao.feimagesearch.util.u.b(r6, r5)
                com.etao.feimagesearch.util.u r5 = com.etao.feimagesearch.util.u.this
                tb.rul r5 = r5.a()
                if (r5 == 0) goto L77
                com.etao.feimagesearch.util.u r6 = com.etao.feimagesearch.util.u.this
                java.lang.String r6 = com.etao.feimagesearch.util.u.a(r6)
                if (r6 != 0) goto L74
                java.lang.String r6 = ""
            L74:
                r5.mo2421invoke(r6)
            L77:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.u.a.onChange(boolean, android.net.Uri):void");
        }
    }

    static {
        kge.a(-678714683);
    }

    public u(boolean z, rul<? super String, kotlin.t> rulVar) {
        this.e = z;
        this.f = rulVar;
        this.f7035a = new Handler(Looper.getMainLooper());
        this.c = com.etao.feimagesearch.config.b.cc();
        this.d = new a(this.f7035a);
    }

    public static final /* synthetic */ String a(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61100bbe", new Object[]{uVar}) : uVar.b;
    }

    public static final /* synthetic */ boolean a(u uVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65b1f670", new Object[]{uVar, str})).booleanValue() : uVar.a(str);
    }

    public static final /* synthetic */ void b(u uVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcd750b", new Object[]{uVar, str});
        } else {
            uVar.b = str;
        }
    }

    public /* synthetic */ u(boolean z, rul rulVar, int i, kotlin.jvm.internal.o oVar) {
        this((i & 1) != 0 ? true : z, rulVar);
    }

    public final rul<String, kotlin.t> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("f0a3bb5", new Object[]{this}) : this.f;
    }

    public final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (!this.c || activity == null) {
        } else {
            activity.getContentResolver().registerContentObserver(this.e ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.d);
        }
    }

    public final void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else if (!this.c || activity == null) {
        } else {
            activity.getContentResolver().unregisterContentObserver(this.d);
            this.f7035a.removeCallbacksAndMessages(null);
        }
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

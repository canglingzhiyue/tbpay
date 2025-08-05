package com.taobao.tao.tbmainfragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class j implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-991205287);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TBFragmentHookProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if ((r1 instanceof com.taobao.tao.tbmainfragment.SupportActivity) == false) goto L26;
     */
    @Override // com.taobao.android.nav.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean process(android.content.Intent r13, com.taobao.android.nav.d r14) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.tbmainfragment.j.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r3 = 0
            r1[r3] = r12
            r1[r4] = r13
            r1[r2] = r14
            java.lang.String r13 = "873c91c1"
            java.lang.Object r13 = r0.ipc$dispatch(r13, r1)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L1f:
            boolean r0 = r12.c(r13)
            if (r0 != 0) goto L26
            return r4
        L26:
            android.content.Context r0 = r14.a()
            boolean r0 = com.taobao.tao.tbmainfragment.d.b(r0)
            if (r0 != 0) goto L3b
            android.content.Context r0 = r14.a()
            boolean r0 = com.taobao.tao.tbmainfragment.d.c(r0)
            if (r0 != 0) goto L3b
            return r4
        L3b:
            android.content.Context r0 = r14.a()
            boolean r0 = r12.a(r13, r0)
            if (r0 != 0) goto L46
            return r4
        L46:
            java.lang.String r0 = r12.b(r13)
            if (r0 != 0) goto L4d
            return r4
        L4d:
            android.content.Context r1 = r14.a()
            boolean r5 = r1 instanceof com.taobao.tao.tbmainfragment.SupportActivity
            if (r5 != 0) goto L64
            boolean r5 = r1 instanceof tb.fpz
            if (r5 == 0) goto L63
            tb.fpz r1 = (tb.fpz) r1
            android.content.Context r1 = r1.a()
            boolean r5 = r1 instanceof com.taobao.tao.tbmainfragment.SupportActivity
            if (r5 != 0) goto L64
        L63:
            return r4
        L64:
            r5 = r1
            com.taobao.tao.tbmainfragment.SupportActivity r5 = (com.taobao.tao.tbmainfragment.SupportActivity) r5
            android.support.v4.app.FragmentManager r6 = r5.getSupportFragmentManager()
            int r7 = com.taobao.tao.tbmainfragment.i.c(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "fragment count is "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "TBFragmentHookProcessor"
            com.taobao.tao.util.TBMainLog.tlog(r9, r8)
            boolean r1 = com.taobao.tao.tbmainfragment.d.d(r1)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r8 = "tbMainFragment"
            if (r1 == 0) goto L99
            if (r7 < r3) goto L9c
            java.lang.String r13 = "threeFloorsCount"
            com.alibaba.mtl.appmonitor.AppMonitor.Counter.commit(r8, r13, r10)
            return r4
        L99:
            if (r7 < r2) goto L9c
            return r4
        L9c:
            boolean r1 = r12.a(r6, r13)
            if (r1 != 0) goto La3
            return r4
        La3:
            android.os.Bundle r1 = r12.a(r13)
            boolean r13 = com.taobao.tao.tbmainfragment.s.a(r5, r13, r0, r1)
            if (r13 == 0) goto Lb9
            java.lang.String r13 = "jumpToFragment"
            com.alibaba.mtl.appmonitor.AppMonitor.Counter.commit(r8, r13, r10)
            r14.b(r4, r9)
            r14.a(r4, r9)
        Lb9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.tbmainfragment.j.process(android.content.Intent, com.taobao.android.nav.d):boolean");
    }

    private boolean a(FragmentManager fragmentManager, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0a4dc1a", new Object[]{this, fragmentManager, intent})).booleanValue();
        }
        ISupportFragment a2 = i.a(fragmentManager);
        if (!(a2 instanceof TBMainFragment)) {
            return true;
        }
        Fragment currentFragment = ((TBMainFragment) a2).getCurrentFragment();
        if (currentFragment != null && "com.taobao.tao.homepage.HomepageFragment".equals(currentFragment.getClass().getName()) && (data = intent.getData()) != null) {
            return q.a(data.toString());
        }
        return false;
    }

    private Bundle a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("68eb9a9", new Object[]{this, intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Object obj = extras.get(i.KEY_FRAGMENT_ARGS);
        if (!(obj instanceof Bundle)) {
            return null;
        }
        return (Bundle) obj;
    }

    private String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{this, intent});
        }
        Bundle d = d(intent);
        if (d == null) {
            return null;
        }
        Object obj = d.get(i.KEY_FRAGMENT_NAME);
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    private boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{this, intent})).booleanValue();
        }
        Bundle d = d(intent);
        if (d == null) {
            return false;
        }
        Object obj = d.get(i.KEY_FRAGMENT_JUMP);
        if (!(obj instanceof String)) {
            return false;
        }
        return "true".equals(obj);
    }

    private boolean a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7efd347", new Object[]{this, intent, context})).booleanValue();
        }
        Bundle d = d(intent);
        if (d == null) {
            return false;
        }
        Object obj = d.get(i.SUB_KEY_FRAGMENT_JUMP);
        if (!(obj instanceof String)) {
            return false;
        }
        if (d.c(context) && i.KEY_NEW_DETAIL_IMMERSIVE.equals(obj)) {
            return true;
        }
        return d.a(context, (String) obj);
    }

    private Bundle d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("66fd2c6c", new Object[]{this, intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Object obj = extras.get(i.KEY_FRAGMENT_BUNDLE);
        if (!(obj instanceof Bundle)) {
            return null;
        }
        return (Bundle) obj;
    }
}

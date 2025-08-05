package com.taobao.update;

import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;
import tb.kge;
import tb.rfx;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f23374a;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f23375a = new c();

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("df406bc9", new Object[0]) : f23375a;
        }
    }

    static {
        kge.a(1973216184);
    }

    private c() {
    }

    public static c getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e3215f73", new Object[0]) : a.a();
    }

    public void init(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57f91db", new Object[]{this, bVar});
        } else {
            this.f23374a = bVar;
        }
    }

    public boolean enableDialogUiV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a213da86", new Object[]{this})).booleanValue() : "taobao4android".equals(this.f23374a.group) && "true".equals(PreferenceManager.getDefaultSharedPreferences(UpdateRuntime.getContext()).getString(rfx.UPDATE_DIALOG_UI_V2, "true")) && this.f23374a.enableDialogUiV2;
    }
}

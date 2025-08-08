package com.taobao.themis.open.utils.nav;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/open/utils/nav/NavForResultUtils;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "currentCallback", "Lcom/taobao/themis/open/utils/nav/NavForResultUtils$Callback;", "nav", "", "mContext", "Landroid/content/Context;", "task", "Lcom/taobao/themis/open/utils/nav/NavForResultUtils$NavForResultTask;", "callback", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Callback", "NavForResultTask", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static InterfaceC0968a f22723a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/taobao/themis/open/utils/nav/NavForResultUtils$Callback;", "", "onNavActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.utils.nav.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC0968a {
        void a(int i, int i2, Intent intent);
    }

    static {
        kge.a(606879221);
        INSTANCE = new a();
    }

    private a() {
    }

    public final void a(Context mContext, b task, InterfaceC0968a interfaceC0968a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68163653", new Object[]{this, mContext, task, interfaceC0968a});
            return;
        }
        q.d(mContext, "mContext");
        q.d(task, "task");
        Intent intent = new Intent();
        if (task.a() != null) {
            intent.putExtra("navExtras", task.a());
        }
        if (task.b() != null) {
            intent.putExtra("navOptions", task.b());
        }
        if (!StringUtils.isEmpty(task.e())) {
            intent.putExtra("navUri", task.e());
        }
        if (!StringUtils.isEmpty(task.c())) {
            intent.putExtra("navCategory", task.c());
        }
        if (task.d() != -1) {
            intent.putExtra("navResultCode", task.d());
        }
        intent.setClass(mContext, NavForResultActivity.class);
        f22723a = interfaceC0968a;
        mContext.startActivity(intent);
    }

    public final void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        InterfaceC0968a interfaceC0968a = f22723a;
        if (interfaceC0968a == null) {
            return;
        }
        q.a(interfaceC0968a);
        interfaceC0968a.a(i, i2, intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/utils/nav/NavForResultUtils$NavForResultTask;", "", "()V", "<set-?>", "", "category", "getCategory", "()Ljava/lang/String;", "Landroid/os/Bundle;", "extra", "getExtra", "()Landroid/os/Bundle;", "options", "getOptions", "", "resultCode", "getResultCode", "()I", "url", "getUrl", "withCategory", "withExtra", "withOptions", "withResultCode", "withUrl", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Bundle f22724a;
        private Bundle b;
        private String c;
        private int d = -1;
        private String e;

        static {
            kge.a(-2030838921);
        }

        public final Bundle a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("d1a37f2c", new Object[]{this}) : this.f22724a;
        }

        public final Bundle b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("1bd5186d", new Object[]{this}) : this.b;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }

        public final b a(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fe4905b3", new Object[]{this, bundle});
            }
            this.f22724a = bundle;
            return this;
        }

        public final b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d253ecad", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public final b a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b30b42e4", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }
    }
}

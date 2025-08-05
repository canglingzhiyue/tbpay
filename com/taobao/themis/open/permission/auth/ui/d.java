package com.taobao.themis.open.permission.auth.ui;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/LocalAuthDialog;", "", "activity", "Landroid/app/Activity;", "content", "", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/open/permission/auth/ui/LocalAuthDialog$Callback;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/taobao/themis/open/permission/auth/ui/LocalAuthDialog$Callback;)V", "getActivity", "()Landroid/app/Activity;", "getContent", "()Ljava/lang/String;", "getListener", "()Lcom/taobao/themis/open/permission/auth/ui/LocalAuthDialog$Callback;", "show", "", "Callback", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f22700a;
    private final String b;
    private final a c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/LocalAuthDialog$Callback;", "", "onCancel", "", "onConfirm", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(801711830);
    }

    public d(Activity activity, String content, a listener) {
        q.d(activity, "activity");
        q.d(content, "content");
        q.d(listener, "listener");
        this.f22700a = activity;
        this.b = content;
        this.c = listener;
    }

    public final Activity b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("233c125f", new Object[]{this}) : this.f22700a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public final a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("788b8820", new Object[]{this}) : this.c;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.themis.kernel.utils.a.a(new LocalAuthDialog$show$1(this));
        }
    }
}

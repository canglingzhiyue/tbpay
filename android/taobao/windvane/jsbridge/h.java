package android.taobao.windvane.jsbridge;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.adm;
import tb.kge;

/* loaded from: classes2.dex */
public class h implements adm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IWVWebView f1664a;
    public Object b;
    public Method c;
    public String d;
    public String e;
    public String f;
    public IJsApiFailedCallBack h;
    public IJsApiSucceedCallBack i;
    public String g = "";
    public String j = "";
    private String l = "";
    public volatile boolean k = true;

    static {
        kge.a(-344168200);
        kge.a(1616078155);
    }

    public h() {
        b();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return getCurId() + "-" + this.g;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l = "" + id.addAndGet(1);
    }

    @Override // tb.adm
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return "Bridge_" + this.l;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this}) : this.j;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }
}

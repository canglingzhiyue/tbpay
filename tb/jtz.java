package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.l;
import com.taobao.homepage.page.weexv2.a;

/* loaded from: classes6.dex */
public class jtz implements jua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jvw f29771a;
    private final WeexInstanceImpl b;

    static {
        kge.a(-1858251890);
        kge.a(-86428574);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        }
    }

    public jtz(WeexInstanceImpl weexInstanceImpl) {
        String str;
        this.b = weexInstanceImpl;
        this.f29771a = new jvw(String.valueOf(this.b.getInstanceId()), l.a().o());
        switch (this.b.getMode()) {
            case CANAL_SUB:
            case DOM:
                str = "page2";
                break;
            case MUS:
                str = a.KEY_MUS;
                break;
            case XR:
                str = "xr";
                break;
            case CANAL_MAIN:
                str = "canal_main";
                break;
            case SCRIPT:
                str = "script_only";
                break;
            default:
                str = "page";
                break;
        }
        this.f29771a.a("wxInstanceType", str);
        this.f29771a.a(jvw.KEY_PAGE_METRIC_SDK_INIT_TIME, weexInstanceImpl.getSDKInitTime());
        a(weexInstanceImpl.getBundleUrl());
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f29771a.a(str);
            this.f29771a.a("wxBundleUrl", str);
            this.f29771a.a("wxContainerName", this.b.getContext() instanceof Activity ? this.b.getContext().getClass().getSimpleName() : "unKnowContainer");
        }
    }

    public jvw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvw) ipChange.ipc$dispatch("f069dd3", new Object[]{this}) : this.f29771a;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a().a(str, str2);
        }
    }

    @Override // tb.jua
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            a().a(str, j);
        }
    }

    public void a(int i, View view, jvv jvvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d25fdd", new Object[]{this, new Integer(i), view, jvvVar});
        } else {
            a().a(i, view, jvvVar);
        }
    }

    public void a(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34debf", new Object[]{this, new Integer(i), str, new Long(j)});
        } else {
            a().a(i, str, j);
        }
    }
}

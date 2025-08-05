package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.taobao.android.weex_framework.bridge.b;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class cpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f26419a;

    static {
        kge.a(911496838);
    }

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract void a();

    public abstract void a(int i, int i2, Intent intent);

    public abstract void a(int i, String[] strArr, int[] iArr);

    public abstract void a(Intent intent);

    public abstract void a(JSONObject jSONObject);

    public abstract void a(DynCaptureImgGotConfig dynCaptureImgGotConfig);

    public abstract void a(DynCaptureImgGotConfig dynCaptureImgGotConfig, cpy cpyVar);

    public abstract void a(MusOuterAlbumBean musOuterAlbumBean);

    public abstract void a(String str);

    public abstract void a(boolean z);

    public abstract void a(boolean z, b bVar);

    public abstract void a(boolean z, boolean z2, cpx cpxVar);

    public abstract boolean a(KeyEvent keyEvent);

    public abstract boolean a(adt adtVar, boolean z);

    public abstract void b();

    public abstract void b(boolean z);

    public abstract void c();

    public abstract void c(boolean z);

    public abstract void d();

    public abstract void e();

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract boolean p();

    public abstract void r();

    public cpt(Activity activity) {
        q.c(activity, "activity");
        this.f26419a = activity;
    }

    public final Activity o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("3b454af2", new Object[]{this}) : this.f26419a;
    }
}

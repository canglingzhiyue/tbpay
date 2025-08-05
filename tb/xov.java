package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.mytaobao.homepage.busniess.model.SkinData;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/mytaobao/pagev2/ui/ThemeHelperV2;", "", "()V", "headerBgLayout", "Lcom/taobao/mytaobao/ultron/navtiveview/UserHeaderBgLayout;", "lastThemeData", "Lcom/alibaba/fastjson/JSONObject;", "considerResizeTheme", "", "refreshThemeBySnapshot", "", "skinConfig", "considerSetTheme", "updateThemeBySnapshot", "themeData", "coreConsiderSetThemeData", "initViews", "rv", "Landroid/support/v7/widget/RecyclerView;", "processOverScroll", "scrollY", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f34445a;
    private UserHeaderBgLayout b;

    static {
        kge.a(-2009112422);
    }

    public final void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        a(jSONObject);
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        userHeaderBgLayout.considerLazyInitThemeView();
    }

    public final void b(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfba7c45", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        Integer num = null;
        Integer integer = jSONObject != null ? jSONObject.getInteger(SkinData.KEY_GLOBAL_BG_HEIGHT) : null;
        if (jSONObject != null) {
            num = jSONObject.getInteger(SkinData.KEY_GLOBAL_HORIZONTAL_BG_HEIGHT);
        }
        userHeaderBgLayout.updateThemeHeight(mxq.b(xoy.a(integer, num, 210)));
    }

    private final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.f34445a = null;
            j.a().a("mytaobao");
        } else {
            JSONObject jSONObject2 = this.f34445a;
            if (jSONObject2 != null && jSONObject2.equals(jSONObject)) {
                return;
            }
            j.a().a("mytaobao", jSONObject);
            this.f34445a = jSONObject;
        }
    }

    public final void a(UserHeaderBgLayout headerBgLayout, RecyclerView rv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecea0e4", new Object[]{this, headerBgLayout, rv});
            return;
        }
        q.c(headerBgLayout, "headerBgLayout");
        q.c(rv, "rv");
        this.b = headerBgLayout;
        headerBgLayout.setParentListView(rv);
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        userHeaderBgLayout.processOnScroll(i);
    }
}

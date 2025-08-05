package com.taobao.mytaobao.ui;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/ui/ThemeHelper;", "", "()V", "headerBgLayout", "Lcom/taobao/mytaobao/ultron/navtiveview/UserHeaderBgLayout;", "lastThemeData", "Lcom/alibaba/fastjson/JSONObject;", "considerSetTheme", "", "updateThemeBySnapshot", "", "themeData", "coreConsiderSetThemeData", "initViews", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f18471a;
    private UserHeaderBgLayout b;

    static {
        kge.a(995894526);
    }

    public final void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        b(jSONObject);
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        userHeaderBgLayout.considerLazyInitThemeView();
    }

    private final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.f18471a = null;
            j.a().a("mytaobao");
        } else {
            JSONObject jSONObject2 = this.f18471a;
            if (jSONObject2 != null && jSONObject2.equals(jSONObject)) {
                return;
            }
            j.a().a("mytaobao", jSONObject);
            this.f18471a = jSONObject;
        }
    }

    public final void a(UserHeaderBgLayout headerBgLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd828db6", new Object[]{this, headerBgLayout});
            return;
        }
        q.c(headerBgLayout, "headerBgLayout");
        this.b = headerBgLayout;
    }
}

package com.taobao.cainiao.card;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import java.util.List;
import tb.hyk;
import tb.hyq;
import tb.kge;

/* loaded from: classes6.dex */
public class LogisticDetailCardActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<GoodsInfoEntity> f16851a;

    static {
        kge.a(-1467323391);
    }

    public static /* synthetic */ Object ipc$super(LogisticDetailCardActivity logisticDetailCardActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        String K = hyk.K();
        if (getIntent() != null && getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            try {
                this.f16851a = JSONObject.parseArray(extras.getString("data"), GoodsInfoEntity.class);
            } catch (Exception e) {
                TLog.loge("CN", "CN_CARD", e.getMessage());
            }
            int i = extras.getInt("currentPage");
            List<GoodsInfoEntity> list = this.f16851a;
            if (list != null && !list.isEmpty() && i >= 0 && i < this.f16851a.size()) {
                K = (K + "&trace=" + this.f16851a.get(i).tradeId) + "&statusCode=" + this.f16851a.get(i).status;
            }
            Nav.from(this).toUri(K);
        }
        hyq.a("LogisticDetailCardActivity", "PACKAGE_LIST_DEGRADE", "url=" + K);
        finish();
    }
}

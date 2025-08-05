package com.taobao.tao;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.weexv2.page.WeexV2Activity;
import tb.kge;
import tb.riu;

/* loaded from: classes8.dex */
public class MagicWindowActivity extends WeexV2Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-869472116);
    }

    public static /* synthetic */ Object ipc$super(MagicWindowActivity magicWindowActivity, String str, Object... objArr) {
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

    @Override // com.taobao.weex.weexv2.page.WeexV2Activity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // com.taobao.weex.weexv2.page.WeexV2Activity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        String b = b();
        Uri build = Uri.parse(b).buildUpon().appendQueryParameter(com.taobao.browser.utils.i.WEEX_REFERER_ORIGIN, b).build();
        Intent intent = getIntent();
        intent.setData(build);
        intent.putExtra(riu.c, b);
        intent.putExtra(riu.e, b);
        intent.putExtra(riu.d, b);
        setIntent(intent);
        super.onCreate(bundle);
        getSupportActionBar().c(false);
    }

    private String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : EnvironmentSwitcher.EnvType.OnLINE.getValue() == EnvironmentSwitcher.a() ? "https://meta.m.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true" : "https://meta.wapa.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true";
    }
}

package com.taobao.android.trade.cart.processor;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.trade.cart.constant.CartFrom;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.Set;
import tb.jjn;
import tb.jjo;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1635629725);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "CartNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (dVar == null) {
            return true;
        }
        if (a(intent.getData())) {
            intent.setClassName(dVar.a(), UltronTradeHybridActivity.class.getName());
            dVar.a(true, name());
            dVar.c(JumpAbility.JUMP_ABILITY_FLOATING_WINDOW);
            intent.setData(C0603a.a(intent, jjo.b()));
            return true;
        } else if (C0603a.a(intent)) {
            intent.setClassName(dVar.a(), UltronTradeHybridActivity.class.getName());
            dVar.a(true, name());
            intent.setData(C0603a.a(intent, jjo.c()));
            return true;
        } else if (!CartFrom.TAOBAO_CLIENT.equals(jjn.a(intent))) {
            return true;
        } else {
            if ((!l.d(dVar.a()) && !l.b(dVar.a())) || (data = intent.getData()) == null) {
                return true;
            }
            intent.setData(data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
            return true;
        }
    }

    private boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue() : uri != null && PopStrategy.IDENTIFIER_FLOAT.equals(uri.getQueryParameter("iCartScreenType"));
    }

    /* renamed from: com.taobao.android.trade.cart.processor.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0603a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2059077069);
        }

        public static boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue() : CartFrom.TSM_NATIVE_TAOBAO.equals(jjn.a(intent));
        }

        public static Uri a(Intent intent, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("ab2611e6", new Object[]{intent, str});
            }
            if (intent == null || intent.getData() == null) {
                return null;
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            Uri data = intent.getData();
            Set<String> queryParameterNames = data.getQueryParameterNames();
            if (queryParameterNames != null) {
                for (String str2 : queryParameterNames) {
                    buildUpon.appendQueryParameter(str2, data.getQueryParameter(str2));
                }
            }
            return buildUpon.build();
        }
    }
}

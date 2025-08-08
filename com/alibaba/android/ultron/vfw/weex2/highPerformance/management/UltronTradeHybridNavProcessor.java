package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import tb.iro;
import tb.jqg;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class UltronTradeHybridNavProcessor implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-518391760);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "UltronTradeHybridNavProcessor";
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
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (!iro.a()) {
            jqg.a("UltronTradeHybridNavProcessor", "process:", "enableTradeHybrid false");
            return true;
        } else if (intent == null || intent.getData() == null || intent.getData().getQuery() == null) {
            jqg.a("UltronTradeHybridNavProcessor", "process:", "query is null");
            return true;
        } else {
            String query = intent.getData().getQuery();
            if (!query.contains("tradeHybrid=true")) {
                jqg.a("UltronTradeHybridNavProcessor", "process:", "unhit tradeHybrid");
                return true;
            }
            String uri = intent.getData().toString();
            if (query.contains("forceThemis=true")) {
                return interceptTMSContainer(dVar, uri, query);
            }
            if (enableReuseTradeHybridContainer(dVar, query, intent.getData().getPath())) {
                ((UltronTradeHybridActivity) dVar.a()).b(uri);
                return false;
            }
            intent.setClassName(dVar.a(), UltronTradeHybridActivity.class.getName());
            dVar.a(true, name());
            if (query.contains("nav_jump_mode=std_mega_pop")) {
                dVar.c(JumpAbility.JUMP_ABILITY_FLOATING_WINDOW);
            }
            return true;
        }
    }

    private boolean enableReuseTradeHybridContainer(com.taobao.android.nav.d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dbd3c5b", new Object[]{this, dVar, str, str2})).booleanValue() : (dVar.a() instanceof UltronTradeHybridActivity) && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enableReuseTradeHybridContainer", true) && str.contains("reuseTradeHybridContainer=true") && !str.contains("pageType=pop");
    }

    private boolean interceptTMSContainer(com.taobao.android.nav.d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f5eacd2", new Object[]{this, dVar, str, str2})).booleanValue();
        }
        if (!iro.c()) {
            jqg.a("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "switcher is off");
            return true;
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            jqg.a("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "url or query is empty");
            return true;
        } else if (dVar == null || !(dVar.a() instanceof FragmentActivity)) {
            jqg.a("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "navContext is null");
            return true;
        } else {
            com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a aVar = null;
            if (dVar.a() instanceof com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a) {
                aVar = (com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a) dVar.a();
            }
            ISupportFragment a2 = com.taobao.tao.tbmainfragment.i.a(((FragmentActivity) dVar.a()).getSupportFragmentManager());
            if (aVar == null && (a2 instanceof com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a)) {
                aVar = (com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a) a2;
            }
            if (aVar != null) {
                return !aVar.displayByTMSHost(str);
            }
            jqg.a("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "tmsHost is null");
            return true;
        }
    }
}

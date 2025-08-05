package com.taobao.search.searchdoor.searchbar.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.nra;
import tb.nrb;

/* loaded from: classes7.dex */
public class SearchBarHintBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MULTI_HINT_SPLITTER = " \\| ";
    public String aac;
    public String atmosImg;
    public String darkAtmosImg;
    public ActivateCellBean discovery;
    public String displayText;
    public HashMap<String, String> extraParams;
    public int iconHeight;
    public String iconName;
    public String iconUrl;
    public int iconWidth;
    public String[] multiDisplayText;
    public String[] multiSearchText;
    public String searchText;
    public String suggestRn;
    public Map<String, String> utParams;
    public String voiceColor;
    public String voiceMask;
    public String voiceText;
    public boolean hasRefresh = false;
    public SearchBarHintADBean advInfo = null;
    public SearchBarHintStructuredBean structuredInfo = null;

    static {
        kge.a(1177355846);
    }

    public void updateHint(nrb nrbVar) {
        nra nraVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb8a709", new Object[]{this, nrbVar});
        } else if (nrbVar == null || nrbVar.a() == null || nrbVar.a().isEmpty() || (nraVar = nrbVar.a().get(0)) == null || TextUtils.isEmpty(nraVar.a())) {
        } else {
            this.displayText = nraVar.a();
            this.searchText = nraVar.b();
            this.extraParams = new HashMap<>(nraVar.c());
            this.suggestRn = nrbVar.b();
            this.iconUrl = nraVar.f();
            this.iconWidth = g.b(nraVar.e(), 0);
            this.iconHeight = g.b(nraVar.d(), 0);
            this.advInfo = null;
            this.structuredInfo = null;
            this.utParams = null;
            this.hasRefresh = true;
        }
    }

    public boolean isAdvHint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86c7dddb", new Object[]{this})).booleanValue() : this.advInfo != null;
    }

    public boolean isStructuredHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673d5ecd", new Object[]{this})).booleanValue();
        }
        SearchBarHintStructuredBean searchBarHintStructuredBean = this.structuredInfo;
        return (searchBarHintStructuredBean == null || searchBarHintStructuredBean.getInfoList() == null || this.structuredInfo.getInfoList().isEmpty()) ? false : true;
    }

    public String getAtmosImg(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9fdfb92e", new Object[]{this, new Boolean(z)}) : (!z || TextUtils.isEmpty(this.darkAtmosImg)) ? this.atmosImg : this.darkAtmosImg;
    }

    public void handleMultiHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e5ba9f", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.displayText) && this.displayText.contains(" | ")) {
            String[] split = this.displayText.split(MULTI_HINT_SPLITTER);
            this.displayText = split[0];
            this.multiDisplayText = split;
        }
        if (TextUtils.isEmpty(this.searchText) || !this.searchText.contains(" | ")) {
            return;
        }
        String[] split2 = this.searchText.split(MULTI_HINT_SPLITTER);
        this.searchText = split2[0];
        this.multiSearchText = split2;
        if (this.multiDisplayText != null) {
            return;
        }
        this.multiDisplayText = split2;
    }
}

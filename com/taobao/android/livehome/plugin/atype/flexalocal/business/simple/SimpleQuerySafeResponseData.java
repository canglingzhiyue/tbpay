package com.taobao.android.livehome.plugin.atype.flexalocal.business.simple;

import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class SimpleQuerySafeResponseData implements IMTOPDataObject {
    public String accountHeadPic;
    public String accountName;
    public String encodeAccountId;
    public boolean follow;
    public String liveId;
    public ArrayList<QualitySelectItem> liveUrlList;
    public int roomStatus;
    public String simpleTransParams;

    static {
        kge.a(79210867);
        kge.a(-350052935);
    }
}

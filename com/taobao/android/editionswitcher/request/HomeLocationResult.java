package com.taobao.android.editionswitcher.request;

import com.taobao.android.editionswitcher.OvsPopExt;
import java.io.Serializable;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class HomeLocationResult implements Serializable, IMTOPDataObject {
    public String cityId;
    public String cityName;
    public String countryId;
    public String countryName;
    public String editionCode;
    public String elderHome;
    public Map<String, String> elderTags;
    public String forceSwitch;
    public String hTaoContentImg;
    public String invitedElder;
    public String isNewVillageDialog;
    public String isVillageUser;
    public String oldDialogContentImg;
    public String oldDialogSubTitle;
    public String oldDialogTitle;
    public String villageButtonTitle;
    public String villageDesc;
    public String villageExpTimeInterval;
    public String villageForceSwitch;
    public String villageTitle;
    public Map<String, String> yixiuTrack;
    public OvsPopExt ovsPopExt = new OvsPopExt();
    public boolean i18nBlackIp = false;

    static {
        kge.a(-1408853228);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}

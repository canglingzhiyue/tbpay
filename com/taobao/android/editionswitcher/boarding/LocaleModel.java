package com.taobao.android.editionswitcher.boarding;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class LocaleModel implements Serializable, IMTOPDataObject {
    public List<SiteLangModel> countryInfo;
    public SiteLangModel currentCountryInfo;
    public Map<String, HomePopData> homePops;
    public PromoteText promoteText;

    /* loaded from: classes5.dex */
    public static class HomePopData implements Serializable, IMTOPDataObject {
        public String chineseButtonTitle;
        public String foreignButtonTitle;
        public String headerImg;
        public String title;

        static {
            kge.a(109486007);
            kge.a(1028243835);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes5.dex */
    public static class LangModel implements Serializable, IMTOPDataObject {
        public boolean defaultLang;
        public String lang;
        public String langName;

        static {
            kge.a(1402282134);
            kge.a(1028243835);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes5.dex */
    public static class PromoteText implements Serializable, IMTOPDataObject {
        public String bottomTips;
        public String protocolPrefix;
        public String selectText;

        static {
            kge.a(1643153672);
            kge.a(1028243835);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes5.dex */
    public static class SiteLangModel implements Serializable, IMTOPDataObject {
        public boolean i18nBlackIp = false;
        public boolean i18nEnable = false;
        public List<LangModel> langs;
        public String site;
        public SiteName siteName;

        static {
            kge.a(1954859919);
            kge.a(1028243835);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes5.dex */
    public static class SiteName implements Serializable, IMTOPDataObject {
        public String en_us;
        public String zh;

        static {
            kge.a(118254679);
            kge.a(1028243835);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(-1545282241);
        kge.a(1028243835);
        kge.a(-350052935);
    }

    public static LocaleModel getDefault() {
        return (LocaleModel) JSON.parseObject("{\"countryInfo\":[{\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文\"}],\"site\":\"CN\",\"siteName\":{\"en_US\":\"Mainland of China\",\"zh_CN\":\"中国大陆\"}},{\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文\"}],\"site\":\"SG\",\"siteName\":{\"en_US\":\"Singapore\",\"zh_CN\":\"新加坡\"}},{\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文\"}],\"site\":\"MY\",\"siteName\":{\"en_US\":\"Malaysia\",\"zh_CN\":\"马来西亚\"}}],\"currentCountryInfo\":{\"i18nBlackIp\":\"false\",\"i18nEnable\":\"false\",\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文 \"}],\"site\":\"CN\",\"siteName\":{\"en_US\":\"Mainland of China\",\"zh_CN\":\"中国大陆\"}},\"promoteText\":{\"bottomTips\":\"You can modify in Account > Settings\",\"selectText\":\"select region and language\"}}", LocaleModel.class);
    }

    /* loaded from: classes5.dex */
    public static class LocaleData implements Serializable, IMTOPDataObject {
        public boolean isDefault;
        public String key;
        public boolean selected;
        public String value;

        static {
            kge.a(-1157273143);
            kge.a(1028243835);
            kge.a(-350052935);
        }

        public LocaleData(String str, String str2) {
            this.selected = false;
            this.isDefault = false;
            this.key = str;
            this.value = str2;
        }

        public LocaleData(String str, String str2, boolean z) {
            this.selected = false;
            this.isDefault = false;
            this.key = str;
            this.value = str2;
            this.isDefault = z;
        }
    }
}

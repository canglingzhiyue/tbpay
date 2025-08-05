package com.taobao.message.util;

import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.localization.d;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.provider.IMPLocalizedProvider;
import com.taobao.message.kit.provider.TranslateCallback;
import com.taobao.message.translate.MtopOvsTranslateBatchSyncTranslateRequest;
import com.taobao.message.translate.MtopOvsTranslateSingleSyncTranslateRequest;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cjn;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u001e\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/taobao/message/util/TBMPLocalizedProvider;", "Lcom/taobao/message/kit/provider/IMPLocalizedProvider;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "batchTranslate", "", "originalTextList", "", "callback", "Lcom/taobao/message/kit/provider/TranslateCallback;", "convertMpLanguageToTbLanguage", "Lcom/alibaba/ability/localization/constants/Language;", LoggingSPCache.STORAGE_LANGUAGE, "", "formatDate", "timestamp", "", "formatDateTime", "getCountry", cjn.HUMMER_FOUNDATION_GET_LANGUAGE, "getLanguageCountry", "getLanguageTag", "getLocation", "getMPLanguage", "isI18nEdition", "", "isSimplifiedChinese", "localizedExpressionText", "expressionText", "localizedString", "id", "key", "setLocale", "locale", "translate", "originalText", "Companion", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class TBMPLocalizedProvider implements IMPLocalizedProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_SCENE;
    public static final Companion Companion;
    public static final String SOURCE_TEXT_CONTENT_TYPE;
    public static final String SOURCE_TEXT_FORMAT_TYPE;
    private final String TAG = "TBMPLocalizedProvider";

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            kge.a(834987898);
            int[] iArr = new int[Language.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Language.SIMPLIFIED_CHINESE.ordinal()] = 1;
            $EnumSwitchMapping$0[Language.ENGLISH.ordinal()] = 2;
        }
    }

    public static final /* synthetic */ String access$getTAG$p(TBMPLocalizedProvider tBMPLocalizedProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("faa9245f", new Object[]{tBMPLocalizedProvider}) : tBMPLocalizedProvider.TAG;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public boolean isSimplifiedChinese() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eef4a576", new Object[]{this})).booleanValue() : b.b();
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public int getMPLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3002adeb", new Object[]{this})).intValue();
        }
        Language a2 = b.a();
        q.a((Object) a2, "Localization.getLanguage()");
        int i = WhenMappings.$EnumSwitchMapping$0[a2.ordinal()];
        if (i == 1) {
            return 1001;
        }
        return i != 2 ? 1000 : 1002;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[]{this});
        }
        Language a2 = b.a();
        q.a((Object) a2, "Localization.getLanguage()");
        String language = a2.getLanguage();
        q.a((Object) language, "Localization.getLanguage().language");
        return language;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73367799", new Object[]{this});
        }
        Language a2 = b.a();
        q.a((Object) a2, "Localization.getLanguage()");
        String country = a2.getCountry();
        q.a((Object) country, "Localization.getLanguage().country");
        return country;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLanguageTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1981fe8d", new Object[]{this});
        }
        Language a2 = b.a();
        q.a((Object) a2, "Localization.getLanguage()");
        String tag = a2.getTag();
        q.a((Object) tag, "Localization.getLanguage().tag");
        return tag;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLanguageCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56d95511", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Language a2 = b.a();
        q.a((Object) a2, "Localization.getLanguage()");
        sb.append(a2.getLanguage());
        sb.append("_");
        Language a3 = b.a();
        q.a((Object) a3, "Localization.getLanguage()");
        sb.append(a3.getCountry());
        return sb.toString();
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String formatDate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d58945a8", new Object[]{this, new Long(j)});
        }
        String a2 = d.a(j, 7);
        q.a((Object) a2, "DateFormat.format(timestamp, DateFormat.FLAG_DATE)");
        return a2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String formatDateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b5aa255", new Object[]{this, new Long(j)});
        }
        String a2 = d.a(j, 31);
        q.a((Object) a2, "DateFormat.format(timest…ateFormat.FLAG_DATE_TIME)");
        return a2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String localizedString(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c25c8543", new Object[]{this, key});
        }
        q.c(key, "key");
        String a2 = b.a(key);
        return a2 == null ? "" : a2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String localizedString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f754730", new Object[]{this, new Integer(i)});
        }
        String a2 = b.a(i);
        return a2 == null ? "" : a2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String localizedExpressionText(String expressionText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b44229ef", new Object[]{this, expressionText});
        }
        q.c(expressionText, "expressionText");
        Matcher matcher = Pattern.compile("\\$\\{mp_localization_([^}]*)\\}").matcher(expressionText);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group == null) {
                group = "";
            }
            matcher.appendReplacement(stringBuffer, localizedString(group));
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        q.a((Object) stringBuffer2, "stringBuffer.toString()");
        return stringBuffer2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public void translate(String originalText, final TranslateCallback<String> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb36a59", new Object[]{this, originalText, callback});
            return;
        }
        q.c(originalText, "originalText");
        q.c(callback, "callback");
        MtopOvsTranslateSingleSyncTranslateRequest mtopOvsTranslateSingleSyncTranslateRequest = new MtopOvsTranslateSingleSyncTranslateRequest();
        mtopOvsTranslateSingleSyncTranslateRequest.setBizScene(BIZ_SCENE);
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceLanguage(Language.SIMPLIFIED_CHINESE.getTag());
        mtopOvsTranslateSingleSyncTranslateRequest.setTargetLanguage(Language.ENGLISH.getTag());
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceTextContentType(SOURCE_TEXT_CONTENT_TYPE);
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceTextFormatType(SOURCE_TEXT_FORMAT_TYPE);
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceTextFormatType(originalText);
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopOvsTranslateSingleSyncTranslateRequest);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.util.TBMPLocalizedProvider$translate$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object o) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, o});
                    return;
                }
                q.c(mtopResponse, "mtopResponse");
                q.c(o, "o");
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onSystemError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback = callback;
                String retMsg = mtopResponse.getRetMsg();
                q.a((Object) retMsg, "mtopResponse.retMsg");
                translateCallback.onTranslateError(retMsg);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object o) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, o});
                    return;
                }
                q.c(mtopResponse, "mtopResponse");
                q.c(baseOutDo, "baseOutDo");
                q.c(o, "o");
                try {
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    TranslateCallback translateCallback = callback;
                    String string = dataJsonObject.getString("targetText");
                    q.a((Object) string, "jsonObject.getString(\"targetText\")");
                    translateCallback.onTranslateComplete(string);
                } catch (Throwable th) {
                    TranslateCallback translateCallback2 = callback;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "handle mtop callback failed";
                    }
                    translateCallback2.onTranslateError(message);
                    String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                    TLog.loge(access$getTAG$p, "error " + th.toString());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object o) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, o});
                    return;
                }
                q.c(mtopResponse, "mtopResponse");
                q.c(o, "o");
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback = callback;
                String retMsg = mtopResponse.getRetMsg();
                q.a((Object) retMsg, "mtopResponse.retMsg");
                translateCallback.onTranslateError(retMsg);
            }
        });
        build.startRequest(MtopOvsTranslateSingleSyncTranslateRequest.class);
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public void batchTranslate(final List<String> originalTextList, final TranslateCallback<List<String>> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4d59ec", new Object[]{this, originalTextList, callback});
            return;
        }
        q.c(originalTextList, "originalTextList");
        q.c(callback, "callback");
        MtopOvsTranslateBatchSyncTranslateRequest mtopOvsTranslateBatchSyncTranslateRequest = new MtopOvsTranslateBatchSyncTranslateRequest();
        mtopOvsTranslateBatchSyncTranslateRequest.setBizScene(BIZ_SCENE);
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceLanguage(Language.SIMPLIFIED_CHINESE.getTag());
        mtopOvsTranslateBatchSyncTranslateRequest.setTargetLanguage(Language.ENGLISH.getTag());
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceTextContentType(SOURCE_TEXT_CONTENT_TYPE);
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceTextFormatType(SOURCE_TEXT_FORMAT_TYPE);
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceTextList(originalTextList.toString());
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopOvsTranslateBatchSyncTranslateRequest);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.util.TBMPLocalizedProvider$batchTranslate$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object o) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, o});
                    return;
                }
                q.c(mtopResponse, "mtopResponse");
                q.c(o, "o");
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onSystemError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback = callback;
                String retMsg = mtopResponse.getRetMsg();
                q.a((Object) retMsg, "mtopResponse.retMsg");
                translateCallback.onTranslateError(retMsg);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object o) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, o});
                    return;
                }
                q.c(mtopResponse, "mtopResponse");
                q.c(baseOutDo, "baseOutDo");
                q.c(o, "o");
                try {
                    JSONArray optJSONArray = mtopResponse.getDataJsonObject().optJSONArray("translateResponseList");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray.length() == originalTextList.size()) {
                        int length = optJSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            arrayList.add(optJSONArray.getJSONObject(i2).getString("targetText"));
                        }
                        callback.onTranslateComplete(arrayList);
                        return;
                    }
                    callback.onTranslateError("result length is not equal to input length");
                } catch (Throwable th) {
                    TranslateCallback translateCallback = callback;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "handle mtop callback failed";
                    }
                    translateCallback.onTranslateError(message);
                    String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                    TLog.loge(access$getTAG$p, "error " + th.toString());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object o) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, o});
                    return;
                }
                q.c(mtopResponse, "mtopResponse");
                q.c(o, "o");
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback = callback;
                String retMsg = mtopResponse.getRetMsg();
                q.a((Object) retMsg, "mtopResponse.retMsg");
                translateCallback.onTranslateError(retMsg);
            }
        });
        build.startRequest(MtopOvsTranslateBatchSyncTranslateRequest.class);
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public boolean isI18nEdition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[]{this})).booleanValue() : b.c();
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d853caae", new Object[]{this});
        }
        String d = b.d();
        q.a((Object) d, "Localization.getLocation()");
        return d;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public void setLocale(int i, String locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d255d4a", new Object[]{this, new Integer(i), locale});
            return;
        }
        q.c(locale, "locale");
        if (convertMpLanguageToTbLanguage(i) != null) {
            return;
        }
        String str = this.TAG;
        TLog.loge(str, "cannot find language for " + i);
    }

    private final Language convertMpLanguageToTbLanguage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("faf7016", new Object[]{this, new Integer(i)});
        }
        if (i == 1001) {
            return Language.SIMPLIFIED_CHINESE;
        }
        if (i == 1002) {
            return Language.ENGLISH;
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/message/util/TBMPLocalizedProvider$Companion;", "", "()V", "BIZ_SCENE", "", "SOURCE_TEXT_CONTENT_TYPE", "SOURCE_TEXT_FORMAT_TYPE", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        static {
            kge.a(-1968610255);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    static {
        kge.a(-182003671);
        kge.a(2114198346);
        Companion = new Companion(null);
        BIZ_SCENE = BIZ_SCENE;
        SOURCE_TEXT_FORMAT_TYPE = "text";
        SOURCE_TEXT_CONTENT_TYPE = "chat";
    }
}

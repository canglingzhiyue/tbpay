package com.taobao.themis.kernel.entity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.utils.o;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes9.dex */
public final class InstanceStartParams implements Parcelable {
    private static final String APP_ID = "_ariver_appid";
    private static final String CONTAINER_TYPE = "_container_type";
    public static final a CREATOR;
    private static final String DEBUG_FLAG = "nbsource";
    private static final String KEY_FRAME_TYPE = "_frame_type";
    public static final String KEY_IS_FRAGMENT_CONTAINER = "isFragmentContainer";
    private static final String KEY_OPEN_MODEL = "openModel";
    private static final String KEY_ORI_URL = "ori_url";
    public static final String KEY_PAGE_BG_COLOR = "tms_page_bgcolor";
    private static final String NBSN = "nbsn";
    private static final String NBSV = "nbsv";
    private static final String PAGE = "page";
    private JSONObject extraData;
    private Bundle mQuery;
    private final d mUniAppBaseInfo$delegate;
    private String mUrl;
    private Bundle urlParams;

    static {
        kge.a(736593187);
        kge.a(1630535278);
        CREATOR = new a(null);
    }

    private final i.a getMUniAppBaseInfo() {
        return (i.a) this.mUniAppBaseInfo$delegate.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InstanceStartParams() {
        this.mUniAppBaseInfo$delegate = e.a(new InstanceStartParams$mUniAppBaseInfo$2(this));
        this.extraData = new JSONObject();
    }

    public static final /* synthetic */ String access$getMUrl$p(InstanceStartParams instanceStartParams) {
        String str = instanceStartParams.mUrl;
        if (str == null) {
            q.b("mUrl");
        }
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams(Parcel parcel) {
        this();
        q.d(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        if (readBundle == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
        this.urlParams = readBundle;
        Bundle readBundle2 = parcel.readBundle(getClass().getClassLoader());
        if (readBundle2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
        this.mQuery = readBundle2;
        String readString = parcel.readString();
        this.mUrl = readString == null ? "" : readString;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams(String url, Bundle startParams, Bundle query) {
        this();
        q.d(url, "url");
        q.d(startParams, "startParams");
        q.d(query, "query");
        this.urlParams = startParams;
        this.mQuery = query;
        this.mUrl = url;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams(String url, Bundle startParams, Bundle query, JSONObject extraData) {
        this();
        q.d(url, "url");
        q.d(startParams, "startParams");
        q.d(query, "query");
        q.d(extraData, "extraData");
        this.urlParams = startParams;
        this.mQuery = query;
        this.mUrl = url;
        this.extraData = extraData;
    }

    public final JSONObject getExtraData() {
        return this.extraData;
    }

    public final String getStartUrl() {
        String str = this.mUrl;
        if (str == null) {
            q.b("mUrl");
        }
        return str;
    }

    public final boolean isMiniAppDebug() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        if (bundle.containsKey(DEBUG_FLAG)) {
            Bundle bundle2 = this.urlParams;
            if (bundle2 == null) {
                q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
            }
            return q.a((Object) "debug", (Object) com.taobao.themis.utils.e.a(bundle2, DEBUG_FLAG));
        }
        return false;
    }

    public final String getAppId() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, "_ariver_appid");
        q.b(a2, "TMSBundleUtils.getString(urlParams, APP_ID)");
        return a2;
    }

    public final boolean isUniApp() {
        String str = this.mUrl;
        if (str == null) {
            q.b("mUrl");
        }
        return i.a(o.b(str));
    }

    public final String getUniAppId() {
        String b;
        i.a mUniAppBaseInfo = getMUniAppBaseInfo();
        return (mUniAppBaseInfo == null || (b = mUniAppBaseInfo.b()) == null) ? "" : b;
    }

    public final String getNBSVersion() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, NBSV);
        q.b(a2, "TMSBundleUtils.getString(urlParams, NBSV)");
        return a2;
    }

    public final AppInfoScene getNBScene() {
        AppInfoScene[] values;
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, NBSN);
        if (TextUtils.isEmpty(a2)) {
            return AppInfoScene.ONLINE;
        }
        for (AppInfoScene appInfoScene : AppInfoScene.values()) {
            if (n.a(appInfoScene.name(), a2, true)) {
                return appInfoScene;
            }
        }
        return AppInfoScene.DEBUG;
    }

    public final String getNBSource() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String nbSource = com.taobao.themis.utils.e.a(bundle, DEBUG_FLAG);
        if (TextUtils.isEmpty(nbSource)) {
            nbSource = "online";
        }
        q.b(nbSource, "nbSource");
        return nbSource;
    }

    public final String getAppFrameType() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, KEY_FRAME_TYPE);
        q.b(a2, "TMSBundleUtils.getString…rlParams, KEY_FRAME_TYPE)");
        return a2;
    }

    public final String getBizType() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, "bizType");
        q.b(a2, "TMSBundleUtils.getString…nts.AppInfo.KEY_BIZ_TYPE)");
        return a2;
    }

    public final String getAppSubType() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, com.taobao.tao.tbmainfragment.i.SUB_KEY_FRAGMENT_JUMP);
        q.b(a2, "TMSBundleUtils.getString…AppInfo.KEY_SUB_BIZ_TYPE)");
        return a2;
    }

    public final boolean getFullScreen() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        return com.taobao.themis.utils.e.a(bundle, "fullScreen", false);
    }

    public final boolean getHideIndicator() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        return com.taobao.themis.utils.e.a(bundle, "hideHomeIndicator", false);
    }

    public final String getSourceChannel() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        return com.taobao.themis.utils.e.a(bundle, "miniappSourceChannel");
    }

    public final String getPageUrl() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, "page");
        q.b(a2, "TMSBundleUtils.getString(urlParams, PAGE)");
        return a2;
    }

    public final String getOpenModel() {
        String str = this.mUrl;
        if (str == null) {
            q.b("mUrl");
        }
        return configOpenMode(o.b(str));
    }

    public final String getContainerType() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, "_container_type");
        q.b(a2, "TMSBundleUtils.getString…rlParams, CONTAINER_TYPE)");
        return a2;
    }

    public final String getPageBgColor() {
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        String a2 = com.taobao.themis.utils.e.a(bundle, KEY_PAGE_BG_COLOR);
        q.b(a2, "TMSBundleUtils.getString…arams, KEY_PAGE_BG_COLOR)");
        return a2;
    }

    public final boolean isFragmentContainer() {
        return com.taobao.themis.utils.i.a(this.extraData, KEY_IS_FRAGMENT_CONTAINER, false);
    }

    private final String configOpenMode(Uri uri) {
        return m.e(uri) ? com.taobao.themis.kernel.i.KEY_AFC_OPEN_LINK : "normal_link";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        q.d(parcel, "parcel");
        Bundle bundle = this.urlParams;
        if (bundle == null) {
            q.b(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = this.mQuery;
        if (bundle2 == null) {
            q.b("mQuery");
        }
        parcel.writeBundle(bundle2);
        String str = this.mUrl;
        if (str == null) {
            q.b("mUrl");
        }
        parcel.writeString(str);
    }

    /* loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator<InstanceStartParams> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.themis.kernel.entity.InstanceStartParams] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ InstanceStartParams createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.themis.kernel.entity.InstanceStartParams[]] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ InstanceStartParams[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
        }

        public InstanceStartParams a(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceStartParams) ipChange.ipc$dispatch("208b2673", new Object[]{this, parcel});
            }
            q.d(parcel, "parcel");
            return new InstanceStartParams(parcel);
        }

        public InstanceStartParams[] a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InstanceStartParams[]) ipChange.ipc$dispatch("3d94224", new Object[]{this, new Integer(i)}) : new InstanceStartParams[i];
        }
    }
}

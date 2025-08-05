package com.taobao.umipublish.extension.windvane;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCMedia;
import com.taobao.android.litecreator.base.data.g;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import com.taobao.android.litecreator.sdk.framework.container.ut.c;
import com.taobao.android.litecreator.service.b;
import com.taobao.android.litecreator.util.an;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.runtimepermission.f;
import com.taobao.tao.homepage.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.umipublish.draft.DraftModel;
import com.taobao.umipublish.draft.c;
import com.taobao.umipublish.extension.mtop.MtopTaobaoMediaTaopaiAccountRoleRequest;
import com.taobao.umipublish.extension.windvane.ILCTabSwitcher;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility;
import com.taobao.umipublish.extension.windvane.abilities.OpenWeexPageAbility;
import com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility;
import com.taobao.umipublish.extension.windvane.abilities.Share2GGWindvaneCall;
import com.taobao.umipublish.extension.windvane.abilities.WVListener;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenAlbumFilmAbility;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenPublishAbility;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenRecordAbility;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import tb.acg;
import tb.hdx;
import tb.hfe;
import tb.hfj;
import tb.icc;
import tb.ior;
import tb.ios;
import tb.izk;
import tb.kge;
import tb.nom;
import tb.rcy;
import tb.rdz;
import tb.reh;
import tb.sqj;
import tb.tek;
import tb.ten;

/* loaded from: classes9.dex */
public class UmiWvPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALBUM_PATH = "https://h5.m.taobao.com/litecreator/album.html";
    public static final String ASYNC_PUBLISH_CANCEL = "asyncPublishCancel";
    public static final String ASYNC_PUBLISH_FIRE_NOTIFICATION = "asyncPublishFireNotification";
    public static final String BASE_64 = "base64";
    private static final String CAN_PRELOAD_PARAMS = "canPreloadPublishParams";
    public static final String CLOSE_FLOAT_WEB_PAGE = "closeFloatWebPage";
    private static final String CLOSE_LC_PAGE = "closeLCPage";
    private static final String CLOSE_WEEX_ACTION = "closeWeex";
    public static final String CLOSE_WEEX_FLOAT_PAGE_ACTION = "closeWeexFloatPage";
    public static final String COVERPICK_PATH_NEW = "https://h5.m.taobao.com/litecreator/video_coverpick_new.html";
    private static final String DELETE_DRAFTS = "deleteDrafts";
    public static final String ENTRY_CLASS_NAME = "com.taobao.umipublish.tnode.LiteCreateEntryActivity";
    private static final String FETCH_DRAFT_LIST = "fetchDraftList";
    public static final String GET_FLOAT_WEB_PAGE_PARAMS = "getFloatWebPageParams";
    public static final String GET_FLOAT_WEEX_PAGE_PARAMS = "getFloatWeexPageParams";
    private static final String GET_PUBLISH_CONFIG = "publishConfig";
    private static final String GET_PUBLISH_CONFIG_V2 = "getPublishConfig";
    private static final String GET_REMOTE_MODULE_SWITCH = "getRemoteModuleSwitch";
    private static final String GET_VIDEO_AND_PHOTO_BIZ_CODE = "getVideoAndPhotoBizCode";
    private static final String IMAGE_CUTOUT_STROKE = "imageCutoutAndStroke";
    public static final String KEY_IMPORT_PICS = "import_pics";
    public static final String KEY_IMPORT_PIC_BASE_64 = "import_pic_base64";
    public static final String KEY_IS_IMPORT_MEDIA_MODE = "is_import_media_mode";
    private static final String KEY_IS_TAOPAI_REMOTE_MODULE = "is_taopai_remote_module";
    public static final String KEY_PATH = "path";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String KEY_VIDEO_COVER = "cover";
    public static final String KEY_XGC_SIMPLE_PUBLISH = "xgc_simple_publish";
    public static final String K_RET_CODE = "errorCode";
    public static final String K_RET_MSG = "message";
    private static final String LE_VERSION_ACTION = "getTemplateMaterialVersion";
    public static final String LINK_PUBLISH_ACTION = "linkPublish";
    private static final String MATERIAL_SDK_VERSION = "getMaterialSdkVersion";
    private static final long MILLISECOND_A_DAY = 86400000;
    public static final String NEW_IMAGEEDIT_PATH = "https://h5.m.taobao.com/litecreator/image_edit.html";
    public static final String NEW_PUBLISH_PATH = "https://h5.m.taobao.com/lc/entry/publish.html";
    public static final String NEW_RECORD_PATH = "https://h5.m.taobao.com/lc/entry/record.html";
    public static final String NEW_RECORD_PATH_DIRECT = "https://h5.m.taobao.com/litecreator/flat_record_directly.html";
    public static final String OPEN_AI_DRESS_ALBUM_PAGE = "openAIDressAlbum";
    public static final String OPEN_AI_FACE_COLLECTION = "openAIPhotoFaceCollection";
    private static final String OPEN_ALBUM_FILM_ACTION = "openAlbumFilm";
    public static final String OPEN_ASR_WINDOW = "openAsrWindow";
    private static final String OPEN_DRAFT = "openDraft";
    private static final String OPEN_NEW_WINDOW_ACTION = "openWindow";
    private static final String OPEN_PUBLISH_ACTION = "openPublish";
    private static final String OPEN_RECORD_ACTION = "openRecord";
    public static final String OPEN_REEDIT_PAGE = "openReEditPage";
    public static final String OPEN_SIMPLE_RECORD = "openSimpleRecord";
    public static final String OPEN_WEEX_FLOAT_PAGE_ACTION = "openWeexFloatPage";
    private static final String OPEN_WEEX_PAGE_ACTION = "openWeexPage";
    private static final String PAGE_ERR = "1001";
    private static final String PAGE_EXIT = "1009";
    private static final String PARAMS_ERR = "1000";
    private static final String PATH_UMI_WEEX = "https://h5.m.taobao.com/umi/weex_page.html";
    private static final String PHOTO_BIZ_CODE = "photo_biz_code";
    public static final String PLUGIN_NAME = "WVUmiPublish";
    private static final String PREPARE_ACTION = "prepare";
    private static final String QUERY_LAST_PUBLISH_TIME = "queryPublishTime";
    private static final String QUICK_PREVIEW = "quickPreview";
    public static final String QUICK_PUBLISH = "quickPublish";
    private static final String READ_LOCAL_IMAGE = "readLocalImage";
    public static final int REQUEST_CODE_FLOAT_WEEX_PAGE = 60005;
    private static final int REQUEST_CODE_FROM_AI_FACE_COLLECTION = 60003;
    public static final int REQUEST_CODE_FROM_ALBUM_PAGE = 60006;
    private static final int REQUEST_CODE_FROM_ASR = 60002;
    public static final int REQUEST_CODE_WEEX_PAGE = 60004;
    private static final String REQUEST_LOCATION_PERMISSION = "requestLocationPermission";
    public static final String RESULT_PARAMS = "result_params";
    private static final String SAVE_IMAGE = "saveImage";
    private static final String SWITCH_TAB = "switchTab";
    private static final String TAG = "UmiWvPlugin";
    private static final String VIDEO_BIZ_CODE = "video_biz_code";
    private static final String VIDEO_EDIT_PATH = "https://h5.m.taobao.com/lc/entry/video_edit.html";
    private static String[] mPermissions;
    private static long sLastOpenTime;
    private static String sUseXgcScenes;
    private String K_OUT_PAGE_VOICE_INPUT_CONTENT = "voice_input_content";
    private String K_OUT_PAGE_VOICE_INPUT_ERROR = "voice_input_error";
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private WVCallBackContext mWVCallBackContext;

    public static String getCoverPickPath(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca6ed748", new Object[]{str}) : COVERPICK_PATH_NEW;
    }

    public static /* synthetic */ Object ipc$super(UmiWvPlugin umiWvPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1afb612", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ boolean access$000(UmiWvPlugin umiWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5fe13ffa", new Object[]{umiWvPlugin, jSONObject})).booleanValue() : umiWvPlugin.openRecord(jSONObject);
    }

    public static /* synthetic */ boolean access$100(UmiWvPlugin umiWvPlugin, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21f6aa56", new Object[]{umiWvPlugin, jSONObject, wVCallBackContext})).booleanValue() : umiWvPlugin.openPublish(jSONObject, wVCallBackContext);
    }

    public static /* synthetic */ Context access$1000(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f9e83221", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$1100(UmiWvPlugin umiWvPlugin, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5457c2f1", new Object[]{umiWvPlugin, wVCallBackContext, str});
        } else {
            umiWvPlugin.notifyError(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ void access$1200(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7824bf2b", new Object[]{umiWvPlugin});
        } else {
            umiWvPlugin.getBizCodeError();
        }
    }

    public static /* synthetic */ void access$1300(UmiWvPlugin umiWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527380c4", new Object[]{umiWvPlugin, jSONObject});
        } else {
            umiWvPlugin.openRecordAfterVersionChecked(jSONObject);
        }
    }

    public static /* synthetic */ void access$1400(UmiWvPlugin umiWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2233b463", new Object[]{umiWvPlugin, jSONObject});
        } else {
            umiWvPlugin.openRecordActivityAfterEnvReady(jSONObject);
        }
    }

    public static /* synthetic */ void access$1500(UmiWvPlugin umiWvPlugin, Intent intent, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a78301", new Object[]{umiWvPlugin, intent, rVar});
        } else {
            umiWvPlugin.putResultDataToWVResult(intent, rVar);
        }
    }

    public static /* synthetic */ void access$1600(UmiWvPlugin umiWvPlugin, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811a1d39", new Object[]{umiWvPlugin, str});
        } else {
            umiWvPlugin.notifyError(str);
        }
    }

    public static /* synthetic */ Context access$1700(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("15f30a8", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$1800(UmiWvPlugin umiWvPlugin, JSONObject jSONObject, JSONArray jSONArray, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781161c4", new Object[]{umiWvPlugin, jSONObject, jSONArray, wVCallBackContext});
        } else {
            umiWvPlugin.startOpenPublishWithMedias(jSONObject, jSONArray, wVCallBackContext);
        }
    }

    public static /* synthetic */ Context access$1900(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("71380baa", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$200(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c9b55634", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$2000(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3f8974c0", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$2100(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f775e241", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ org.json.JSONObject access$2200(UmiWvPlugin umiWvPlugin, Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (org.json.JSONObject) ipChange.ipc$dispatch("b2bf8e69", new Object[]{umiWvPlugin, collection}) : umiWvPlugin.draftModelsToJsonObj(collection);
    }

    public static /* synthetic */ Handler access$2300(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("17bc4d9b", new Object[]{umiWvPlugin}) : umiWvPlugin.mMainHandler;
    }

    public static /* synthetic */ void access$2400(UmiWvPlugin umiWvPlugin, Intent intent, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8f3846", new Object[]{umiWvPlugin, intent, wVCallBackContext});
        } else {
            umiWvPlugin.handleAskEveryoneData(intent, wVCallBackContext);
        }
    }

    public static /* synthetic */ Context access$2500(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d7279845", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$2600(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8f1405c6", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$2700(UmiWvPlugin umiWvPlugin, String str, String str2, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44a15df", new Object[]{umiWvPlugin, str, str2, runnable, runnable2});
        } else {
            umiWvPlugin.doOpenDraft(str, str2, runnable, runnable2);
        }
    }

    public static /* synthetic */ Context access$2800(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("feece0c8", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$2900(UmiWvPlugin umiWvPlugin, DraftModel draftModel, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c7b668", new Object[]{umiWvPlugin, draftModel, runnable, runnable2});
        } else {
            umiWvPlugin.openLitePublish(draftModel, runnable, runnable2);
        }
    }

    public static /* synthetic */ Context access$300(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("81a1c3b5", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$3000(UmiWvPlugin umiWvPlugin, DraftModel draftModel, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f82e57e", new Object[]{umiWvPlugin, draftModel, runnable, runnable2});
        } else {
            umiWvPlugin.openVideoEdit(draftModel, runnable, runnable2);
        }
    }

    public static /* synthetic */ void access$3100(UmiWvPlugin umiWvPlugin, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3b103", new Object[]{umiWvPlugin, draftModel});
        } else {
            umiWvPlugin.openMainPublish(draftModel);
        }
    }

    public static /* synthetic */ Context access$3200(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f5039261", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$3300(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("acefffe2", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ WVCallBackContext access$400(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("3d72b115", new Object[]{umiWvPlugin}) : umiWvPlugin.mWVCallBackContext;
    }

    public static /* synthetic */ Context access$500(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f17a9eb7", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$600(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a9670c38", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$700(UmiWvPlugin umiWvPlugin, Context context, JSONObject jSONObject, rdz rdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72dc3e91", new Object[]{umiWvPlugin, context, jSONObject, rdzVar});
        } else {
            umiWvPlugin.autoFillConfig(context, jSONObject, rdzVar);
        }
    }

    public static /* synthetic */ Context access$800(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("193fe73a", new Object[]{umiWvPlugin}) : umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$900(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75df4ec3", new Object[]{umiWvPlugin});
        } else {
            umiWvPlugin.onClosePage();
        }
    }

    static {
        kge.a(259521004);
        mPermissions = new String[]{"android.permission.RECORD_AUDIO"};
        sLastOpenTime = 0L;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        final JSONObject parseObject;
        StringBuilder sb;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("className", PLUGIN_NAME);
        hashMap.put("funcName", str);
        new c("Page_GGTabs", "gg111.19920601").c(WindvaneCall.TAG, hashMap, true);
        this.mWVCallBackContext = wVCallBackContext;
        if (CLOSE_WEEX_ACTION.equals(str)) {
            return closeWeex();
        }
        if (TextUtils.isEmpty(str2) || (parseObject = JSONObject.parseObject(str2)) == null) {
            notifyError("参数为空");
            return true;
        }
        if (isNeedCheckRemoteModuleState(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(",taopai_remote=");
            sb2.append(isTaopaiRemote(this.mContext) ? "1" : "0");
            String sb3 = sb2.toString();
            if (str != null) {
                sb = new StringBuilder();
                sb.append("wv: action=");
                sb.append(str);
                str3 = ",";
            } else {
                sb = new StringBuilder();
                str3 = "wv:";
            }
            sb.append(str3);
            sb.append(sb3);
            ten.a(sb.toString(), true);
        }
        u.b(TAG, "UmiWvPlugin.execute: action=" + str);
        if (WVCallRegister.INSTANCE.a(str, parseObject, this.mContext, wVCallBackContext)) {
            return true;
        }
        if (OPEN_RECORD_ACTION.equals(str)) {
            if (com.taobao.android.litecreator.base.workflow.e.k(this.mContext)) {
                InnerOpenRecordAbility innerOpenRecordAbility = new InnerOpenRecordAbility();
                innerOpenRecordAbility.setContext(this.mContext);
                innerOpenRecordAbility.setListener(new WVListener(this.mWVCallBackContext));
                innerOpenRecordAbility.execute(parseObject);
            } else {
                autoFillConfig(this.mContext, parseObject, new rdz<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.rdz
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        } else if (jSONObject == null) {
                        } else {
                            UmiWvPlugin.access$000(UmiWvPlugin.this, jSONObject);
                        }
                    }
                });
            }
            return true;
        } else if (OPEN_PUBLISH_ACTION.equals(str)) {
            if (com.taobao.android.litecreator.base.workflow.e.k(this.mContext)) {
                InnerOpenPublishAbility innerOpenPublishAbility = new InnerOpenPublishAbility();
                innerOpenPublishAbility.setContext(this.mContext);
                innerOpenPublishAbility.setListener(new WVListener(this.mWVCallBackContext));
                innerOpenPublishAbility.execute(parseObject);
            } else {
                filterInnerOpenParamsIfHave(parseObject);
                autoFillConfig(this.mContext, parseObject, new rdz<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.rdz
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        } else if (jSONObject == null) {
                        } else {
                            UmiWvPlugin.access$100(UmiWvPlugin.this, jSONObject, wVCallBackContext);
                        }
                    }
                });
            }
            return true;
        } else if (OPEN_WEEX_PAGE_ACTION.equals(str)) {
            OpenWeexPageAbility openWeexPageAbility = new OpenWeexPageAbility();
            openWeexPageAbility.setContext(this.mContext);
            openWeexPageAbility.setListener(new WVListener(this.mWVCallBackContext));
            openWeexPageAbility.execute(parseObject);
            return true;
        } else if ("prepare".equals(str)) {
            return prepare();
        } else {
            if (LE_VERSION_ACTION.equals(str) || MATERIAL_SDK_VERSION.equals(str)) {
                r rVar = new r();
                rVar.a("version", String.valueOf(hdx.LE_VERSION));
                wVCallBackContext.success(rVar);
                return true;
            } else if (GET_VIDEO_AND_PHOTO_BIZ_CODE.equals(str)) {
                return getVideoAndPhotoBizCode(parseObject);
            } else {
                if (FETCH_DRAFT_LIST.equals(str)) {
                    return fetchDraftList(parseObject);
                }
                if (OPEN_DRAFT.equals(str)) {
                    return openDraft(parseObject);
                }
                if (DELETE_DRAFTS.equals(str)) {
                    return deleteDraft(parseObject);
                }
                if ("requestLocationPermission".equals(str)) {
                    requestLocationPermission(parseObject);
                    return true;
                } else if (CAN_PRELOAD_PARAMS.equals(str)) {
                    canPreloadParams();
                    return true;
                } else if (QUERY_LAST_PUBLISH_TIME.equals(str)) {
                    getLastPublishTime();
                    return true;
                } else if (READ_LOCAL_IMAGE.equals(str)) {
                    return readLocalImage(parseObject);
                } else {
                    if (OPEN_ALBUM_FILM_ACTION.equals(str)) {
                        Context a2 = acg.a();
                        if (a2 == null) {
                            a2 = this.mContext;
                        }
                        ten.a(a2, "guangguang", new ten.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.ten.a
                            public void a(String str4, String str5) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                                }
                            }

                            @Override // tb.ten.a
                            public void a() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                } else if (com.taobao.android.litecreator.base.workflow.e.k(UmiWvPlugin.access$200(UmiWvPlugin.this))) {
                                    InnerOpenAlbumFilmAbility innerOpenAlbumFilmAbility = new InnerOpenAlbumFilmAbility();
                                    innerOpenAlbumFilmAbility.setContext(UmiWvPlugin.access$300(UmiWvPlugin.this));
                                    innerOpenAlbumFilmAbility.setListener(new WVListener(UmiWvPlugin.access$400(UmiWvPlugin.this)));
                                    innerOpenAlbumFilmAbility.execute(parseObject);
                                } else {
                                    parseObject.put("xgc", (Object) (UmiWvPlugin.isXgcDegrade(parseObject.getString("biz_scene")) ? "0" : "1"));
                                    final IAlbumFilmBridge iAlbumFilmBridge = (IAlbumFilmBridge) b.a(IAlbumFilmBridge.class, new Object[0]);
                                    if (iAlbumFilmBridge == null) {
                                        return;
                                    }
                                    UmiWvPlugin umiWvPlugin = UmiWvPlugin.this;
                                    UmiWvPlugin.access$700(umiWvPlugin, UmiWvPlugin.access$500(umiWvPlugin), parseObject, new rdz<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.3.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // tb.rdz
                                        public void a(JSONObject jSONObject) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                                            } else if (jSONObject == null) {
                                            } else {
                                                iAlbumFilmBridge.open(UmiWvPlugin.access$600(UmiWvPlugin.this), jSONObject, wVCallBackContext);
                                            }
                                        }
                                    });
                                }
                            }
                        });
                        return true;
                    } else if (GET_PUBLISH_CONFIG_V2.equals(str)) {
                        try {
                            r rVar2 = new r();
                            rVar2.a("HY_SUCCESS");
                            rVar2.a(new org.json.JSONObject(ios.a(com.taobao.android.litecreator.base.workflow.e.c(this.mContext)).a()));
                            wVCallBackContext.success(rVar2);
                        } catch (Exception e) {
                            r rVar3 = new r();
                            rVar3.a("HY_FAILED");
                            rVar3.a("errorCode", "1000");
                            rVar3.a("message", "获取发布器参数错误，" + e.getMessage());
                            wVCallBackContext.error(rVar3);
                        }
                        return true;
                    } else if (GET_PUBLISH_CONFIG.equals(str)) {
                        new PublishConfigManager().a(this.mContext, parseObject, new rdz<String>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.rdz
                            public void a(String str4) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                                } else {
                                    wVCallBackContext.success(str4);
                                }
                            }
                        });
                        return true;
                    } else if (GET_REMOTE_MODULE_SWITCH.equals(str)) {
                        getRemoteModuleSwitch(this.mContext, parseObject);
                        return true;
                    } else if (SAVE_IMAGE.equals(str)) {
                        saveImage(this.mContext, parseObject, wVCallBackContext);
                        return true;
                    } else if (CLOSE_LC_PAGE.equals(str)) {
                        handleClosePage(parseObject, wVCallBackContext);
                        return true;
                    } else if (SWITCH_TAB.equals(str)) {
                        switchTab(parseObject, wVCallBackContext);
                        return true;
                    } else if (QUICK_PREVIEW.equals(str)) {
                        if (checkFastClick()) {
                            return true;
                        }
                        boolean k = com.taobao.android.litecreator.base.workflow.e.k(this.mContext);
                        u.d(TAG, "execute:QUICK_PREVIEW innerPublishMode=" + k);
                        final String str4 = k ? "tab.inspiration" : "activity";
                        UmiPublishMonitor.a().a(str4, "preview_button_click", parseObject);
                        QuickPreviewAbility quickPreviewAbility = new QuickPreviewAbility();
                        quickPreviewAbility.setContext(this.mContext);
                        quickPreviewAbility.setListener(new WVListener(this.mWVCallBackContext) { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str5, Object... objArr) {
                                int hashCode = str5.hashCode();
                                if (hashCode == -650670724) {
                                    super.a((String) objArr[0], (String) objArr[1]);
                                    return null;
                                } else if (hashCode != 40303496) {
                                    throw new InstantReloadException(String.format("String switch could not find '%s'", str5));
                                } else {
                                    super.a((JSONObject) objArr[0]);
                                    return null;
                                }
                            }

                            @Override // com.taobao.umipublish.extension.windvane.abilities.WVListener, com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
                            public void a(JSONObject jSONObject) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                                    return;
                                }
                                super.a(jSONObject);
                                u.b(UmiWvPlugin.TAG, "onSuccess: openQuickPreview ");
                            }

                            @Override // com.taobao.umipublish.extension.windvane.abilities.WVListener, com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
                            public void a(String str5, String str6) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str5, str6});
                                    return;
                                }
                                super.a(str5, str6);
                                u.d(UmiWvPlugin.TAG, "onFailed: " + str5 + str6);
                                if (TextUtils.equals(str5, "-2")) {
                                    UmiPublishMonitor.a().a(str4, "preview_cancel_by_user", parseObject);
                                } else {
                                    UmiPublishMonitor.a().a(str4, str5, str6, "quick_preview_error", parseObject.toJSONString());
                                }
                            }
                        });
                        quickPreviewAbility.execute(parseObject);
                        return true;
                    } else if (TextUtils.equals(str, OPEN_NEW_WINDOW_ACTION)) {
                        openNewWebWindow(this.mContext, parseObject);
                        return true;
                    } else if (TextUtils.equals(str, IMAGE_CUTOUT_STROKE)) {
                        ImageStokeAbility imageStokeAbility = new ImageStokeAbility();
                        imageStokeAbility.setContext(getContext());
                        imageStokeAbility.setListener(new WVListener(this.mWVCallBackContext));
                        imageStokeAbility.execute(parseObject);
                        return true;
                    } else if (TextUtils.equals(str, "shareContentToGG")) {
                        Context a3 = acg.a();
                        if (a3 == null) {
                            a3 = this.mContext;
                        }
                        ten.a(a3, "guangguang", new ten.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.ten.a
                            public void a(String str5, String str6) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str5, str6});
                                }
                            }

                            @Override // tb.ten.a
                            public void a() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                } else {
                                    new Share2GGWindvaneCall((FragmentActivity) UmiWvPlugin.access$800(UmiWvPlugin.this), wVCallBackContext).a(parseObject);
                                }
                            }
                        });
                        return true;
                    } else if (!TextUtils.equals(str, OPEN_SIMPLE_RECORD)) {
                        return false;
                    } else {
                        openSimpleRecord(parseObject, wVCallBackContext);
                        return true;
                    }
                }
            }
        }
    }

    private boolean isNeedCheckRemoteModuleState(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33ab158c", new Object[]{this, str})).booleanValue() : !CAN_PRELOAD_PARAMS.equalsIgnoreCase(str) && !GET_REMOTE_MODULE_SWITCH.equalsIgnoreCase(str) && !FETCH_DRAFT_LIST.equalsIgnoreCase(str) && !MATERIAL_SDK_VERSION.equalsIgnoreCase(str);
    }

    private void switchTab(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ace765", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (!(this.mContext instanceof Activity) || jSONObject == null || jSONObject.size() <= 0) {
            wVCallBackContext.error(reh.a("-1", "noSuchTab"));
        } else {
            String string = jSONObject.getString("targetTab");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error(reh.a("-1", "noSuchTab"));
            } else {
                ((ILCTabSwitcher) b.a(ILCTabSwitcher.class, new Object[0])).switchTargetTab(this.mContext, string, new ILCTabSwitcher.OnSwitchResult() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.umipublish.extension.windvane.ILCTabSwitcher.OnSwitchResult
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            wVCallBackContext.success();
                        }
                    }

                    @Override // com.taobao.umipublish.extension.windvane.ILCTabSwitcher.OnSwitchResult
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else {
                            wVCallBackContext.error(reh.a("-1", "noSuchTab"));
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleClosePage(com.alibaba.fastjson.JSONObject r5, android.taobao.windvane.jsbridge.WVCallBackContext r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.umipublish.extension.windvane.UmiWvPlugin.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "7d7a4187"
            r0.ipc$dispatch(r5, r1)
            return
        L18:
            android.content.Context r0 = r4.mContext
            boolean r0 = r0 instanceof android.app.Activity
            java.lang.String r1 = "noLCPage"
            java.lang.String r3 = "-1"
            if (r0 != 0) goto L2a
            android.taobao.windvane.jsbridge.r r5 = tb.reh.a(r3, r1)
            r6.error(r5)
            return
        L2a:
            if (r5 == 0) goto L40
            int r0 = r5.size()
            if (r0 <= 0) goto L40
            java.lang.String r0 = "targetTab"
            java.lang.String r5 = r5.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L40
            goto L42
        L40:
            java.lang.String r5 = "inspiration"
        L42:
            java.lang.Class<com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker> r0 = com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker.class
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = com.taobao.android.litecreator.service.b.a(r0, r2)
            com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker r0 = (com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker) r0
            android.content.Context r2 = r4.mContext
            boolean r2 = r0.checkIsLCRecordPage(r2)
            if (r2 != 0) goto L5c
            android.taobao.windvane.jsbridge.r r5 = tb.reh.a(r3, r1)
            r6.error(r5)
            return
        L5c:
            r6.success()
            android.content.Context r6 = r4.mContext
            com.taobao.umipublish.extension.windvane.UmiWvPlugin$8 r1 = new com.taobao.umipublish.extension.windvane.UmiWvPlugin$8
            r1.<init>()
            boolean r6 = r0.checkNeedShow(r6, r5, r1)
            if (r6 != 0) goto L72
            r0.stateUtTabQuit(r5)
            r4.onClosePage()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.extension.windvane.UmiWvPlugin.handleClosePage(com.alibaba.fastjson.JSONObject, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    private void onClosePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d5b60f", new Object[]{this});
            return;
        }
        Activity activity = (Activity) this.mContext;
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    private void saveImage(Context context, JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd595e0a", new Object[]{this, context, jSONObject, wVCallBackContext});
        } else if (context == null || jSONObject == null || !jSONObject.containsKey("url")) {
            notifyError(wVCallBackContext, com.alibaba.ability.localization.b.a(R.string.gg_pub_params_empty_try_later));
        } else {
            final String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("type");
            if (TextUtils.isEmpty(string2)) {
                string2 = "base64";
            }
            u.d(TAG, "saveImage: type=" + string2);
            if (!TextUtils.equals(string2, "base64")) {
                notifyError(wVCallBackContext, com.alibaba.ability.localization.b.a(R.string.gg_pub_format_not_supported));
                return;
            }
            final String[] strArr = new String[1];
            au.a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        strArr[0] = rcy.a(UmiWvPlugin.access$1000(UmiWvPlugin.this), string);
                    }
                }
            }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    r rVar = new r();
                    if (TextUtils.isEmpty(strArr[0])) {
                        UmiWvPlugin.access$1100(UmiWvPlugin.this, wVCallBackContext, com.alibaba.ability.localization.b.a(R.string.gg_pub_save_photo_failed_retry));
                        return;
                    }
                    rVar.a("path", strArr[0]);
                    wVCallBackContext.success(rVar);
                }
            });
        }
    }

    private void notifyError(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97731c8d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("HY_FAILED");
        rVar.a("message", str);
        rVar.a("errorCode", PAGE_EXIT);
        wVCallBackContext.error(rVar);
    }

    private void getRemoteModuleSwitch(final Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405afb0b", new Object[]{this, context, jSONObject});
            return;
        }
        boolean c = com.taobao.android.pissarro.remote.b.c();
        if (!c) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.android.pissarro.remote.b.a(context.getApplicationContext());
                    }
                }
            });
        }
        r rVar = new r();
        rVar.a("is_taopai_remote", Boolean.valueOf(isTaopaiRemote(context)));
        rVar.a("is_taopai_init", Boolean.valueOf(c));
        this.mWVCallBackContext.success(rVar);
    }

    private boolean isTaopaiRemote(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("285002ff", new Object[]{this, context})).booleanValue();
        }
        try {
            z = izk.e();
        } catch (Throwable unused) {
            z = false;
        }
        UmiPublishMonitor.a("isTaopaiRemote=" + z, new Object[0]);
        return z;
    }

    private void requestLocationPermission(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed83ed6", new Object[]{this, jSONObject});
        } else {
            f.a(this.mContext, new String[]{a.ACCESS_FINE_LOCATION}).a(jSONObject.containsKey("rationalStr") ? jSONObject.getString("rationalStr") : com.alibaba.ability.localization.b.a(R.string.gg_pub_location_function_needs_authorization)).b(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UmiWvPlugin.access$400(UmiWvPlugin.this).error(new r("HY_FAILED"));
                    }
                }
            }).a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UmiWvPlugin.access$400(UmiWvPlugin.this).success(new r("HY_SUCCESS"));
                    }
                }
            }).a(true).b(jSONObject.containsKey(ag.KEY_TAOKE_BIZSCENE) ? jSONObject.getString(ag.KEY_TAOKE_BIZSCENE) : "guangguang").a();
        }
    }

    private void openNewWebWindow(final Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c866eb7d", new Object[]{this, context, jSONObject});
            return;
        }
        final String string = jSONObject.getString("url");
        if (!TextUtils.isEmpty(string)) {
            if (m.a(jSONObject, "popBeforeOpen", false) && (context instanceof Activity)) {
                ((Activity) context).finish();
            }
            au.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Nav.from(context).toUri(string);
                    }
                }
            });
            return;
        }
        notifyError("url为空");
    }

    private boolean readLocalImage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e21ba427", new Object[]{this, jSONObject})).booleanValue();
        }
        r rVar = new r();
        try {
            String string = jSONObject.getString("path");
            int intValue = jSONObject.getInteger("width").intValue();
            int intValue2 = jSONObject.getInteger("height").intValue();
            String string2 = jSONObject.getString("mode");
            if (!TextUtils.isEmpty(string) && intValue != 0 && intValue2 != 0) {
                if (!k.e(string)) {
                    rVar.a("errorCode", "1001");
                    this.mWVCallBackContext.error(rVar);
                    return true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(string);
                if (decodeFile == null) {
                    rVar.a("errorCode", "1002");
                    this.mWVCallBackContext.error(rVar);
                    return true;
                }
                Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float width = intValue / decodeFile.getWidth();
                float height = intValue2 / decodeFile.getHeight();
                if (AliSDetailScaleType.centerCrop.equals(string2)) {
                    width = Math.max(width, height);
                }
                Matrix matrix = new Matrix();
                matrix.postScale(width, width);
                Paint paint = new Paint();
                paint.setColor(-1);
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                canvas.drawBitmap(createBitmap2, (intValue - createBitmap2.getWidth()) / 2, (intValue2 - createBitmap2.getHeight()) / 2, paint);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                rVar.a("data", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                this.mWVCallBackContext.success(rVar);
                return true;
            }
            rVar.a("errorCode", "1003");
            this.mWVCallBackContext.error(rVar);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            rVar.a("errorCode", "1000");
            this.mWVCallBackContext.error(rVar);
            return true;
        }
    }

    private void autoFillConfig(final Context context, JSONObject jSONObject, final rdz<JSONObject> rdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e1d68b", new Object[]{this, context, jSONObject, rdzVar});
        } else if (jSONObject.getBooleanValue("autoFillConfig")) {
            new PublishConfigManager().a(context, jSONObject, new rdz<String>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rdz
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    JSONObject parseObject = JSONObject.parseObject(str);
                    if (parseObject == null) {
                        hfj.a(context, com.alibaba.ability.localization.b.a(R.string.gg_pub_opening_failed_try_later));
                        rdzVar.a(null);
                    } else if (!TextUtils.equals(parseObject.getString("status"), "0") && !TextUtils.isEmpty(parseObject.getString("actionUrl"))) {
                        Nav.from(context).toUri(parseObject.getString("actionUrl"));
                        rdzVar.a(null);
                    } else {
                        rdzVar.a(parseObject.getJSONObject("publishParams"));
                    }
                }
            });
        } else {
            rdzVar.a(jSONObject);
        }
    }

    private void canPreloadParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e43b806", new Object[]{this});
            return;
        }
        long b = an.b("last_enter_pub_time", 0L);
        String str = (b == 0 || System.currentTimeMillis() - b >= ((long) tek.l()) * 86400000) ? "NO" : nom.VALUE_YES;
        r rVar = new r();
        rVar.a("has_preload", str);
        this.mWVCallBackContext.success(rVar);
    }

    private void getLastPublishTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7855ee57", new Object[]{this});
            return;
        }
        long b = an.b("last_pub_suc_time", 0L);
        r rVar = new r();
        rVar.a("publish_timestamp", Long.valueOf(b / 1000));
        this.mWVCallBackContext.success(rVar);
    }

    private void notifyError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714e6190", new Object[]{this, str});
        } else if (this.mWVCallBackContext == null) {
        } else {
            r rVar = new r();
            rVar.a("HY_FAILED");
            rVar.a("message", str);
            rVar.a("errorCode", PAGE_EXIT);
            this.mWVCallBackContext.error(rVar);
        }
    }

    private boolean getVideoAndPhotoBizCode(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8620ca4d", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("priorityType");
        final JSONObject jSONObject2 = jSONObject.getJSONObject("videoBizCodeMap");
        final JSONObject jSONObject3 = jSONObject.getJSONObject("photoBizCodeMap");
        MtopTaobaoMediaTaopaiAccountRoleRequest mtopTaobaoMediaTaopaiAccountRoleRequest = new MtopTaobaoMediaTaopaiAccountRoleRequest();
        mtopTaobaoMediaTaopaiAccountRoleRequest.setPriorityType(string);
        MtopBusiness.build(Mtop.instance(null), mtopTaobaoMediaTaopaiAccountRoleRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    UmiWvPlugin.access$1200(UmiWvPlugin.this);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String optString = mtopResponse.getDataJsonObject().optString("data");
                r rVar = new r();
                JSONObject jSONObject4 = jSONObject2;
                if (jSONObject4 != null) {
                    rVar.a("video_biz_code", jSONObject4.getString(optString));
                }
                JSONObject jSONObject5 = jSONObject3;
                if (jSONObject5 != null) {
                    rVar.a("photo_biz_code", jSONObject5.getString(optString));
                }
                UmiWvPlugin.access$400(UmiWvPlugin.this).success(rVar);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    UmiWvPlugin.access$1200(UmiWvPlugin.this);
                }
            }
        }).mo1305reqMethod(MethodEnum.POST).startRequest();
        return true;
    }

    private void getBizCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58051045", new Object[]{this});
            return;
        }
        r rVar = new r();
        rVar.a("photo_biz_code", "");
        rVar.a("video_biz_code", "anchor_daren_video_publish");
        this.mWVCallBackContext.success(rVar);
    }

    private void filterInnerOpenParamsIfHave(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffb5c96", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            jSONObject.remove("images");
            jSONObject.remove("video");
            jSONObject.remove(InnerOpenPublishAbility.PARAMS_URL_PARAMS);
        }
    }

    private boolean openWeex(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ae334c2", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("weexUrl");
        if (TextUtils.isEmpty(string)) {
            notifyError("weex页面链接无效");
            return false;
        }
        Uri.Builder buildUpon = Uri.parse(PATH_UMI_WEEX).buildUpon();
        buildUpon.appendQueryParameter("wxUrl", string);
        Nav.from(this.mContext).toUri(buildUpon.build());
        this.mWVCallBackContext.success();
        return true;
    }

    private boolean closeWeex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("262a0624", new Object[]{this})).booleanValue();
        }
        if (!(this.mContext instanceof Activity)) {
            return false;
        }
        ((Activity) this.mContext).finish();
        this.mWVCallBackContext.success();
        return true;
    }

    private boolean isTemplateSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59bf4cd5", new Object[]{this})).booleanValue();
        }
        if (hfe.a()) {
            this.mWVCallBackContext.error();
        } else {
            this.mWVCallBackContext.success();
        }
        return true;
    }

    public static boolean isXgcDegrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9860d461", new Object[]{str})).booleanValue();
        }
        try {
            return Arrays.asList(sUseXgcScenes.split(",")).indexOf(str) < 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static String getTopActivityName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51d023d8", new Object[]{context});
        }
        try {
            return ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity.getClassName();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean isTopActivityEntry(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0624f8d", new Object[]{context})).booleanValue() : TextUtils.equals(getTopActivityName(context), ENTRY_CLASS_NAME);
    }

    private boolean openRecord(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2fcf2", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!tek.m() || isTopActivityEntry(this.mContext)) {
            hfj.a(this.mContext, com.alibaba.ability.localization.b.a(R.string.gg_pub_tapping_too_quickly_wait));
            Toast.makeText(this.mContext.getApplicationContext(), getTopActivityName(this.mContext.getApplicationContext()), 1).show();
            new c("Page_GGTabs", "gg111.19920601").a("EntryClickTooFastTip", (Map<String, String>) null);
            return true;
        }
        jSONObject.put("xgc", "1");
        updateSimplePublishParams(jSONObject);
        addEnableImageMusicFlagIfNeed(jSONObject);
        updateRemoteModulePublishParams(jSONObject);
        IMaterialVersionChecker iMaterialVersionChecker = (IMaterialVersionChecker) b.a(IMaterialVersionChecker.class, new Object[0]);
        if (iMaterialVersionChecker != null) {
            iMaterialVersionChecker.check(this.mContext, 0, jSONObject, new sqj.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sqj.a
                public void a(MaterialDetail materialDetail) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("23a98282", new Object[]{this, materialDetail});
                    } else {
                        UmiWvPlugin.access$1300(UmiWvPlugin.this, jSONObject);
                    }
                }

                @Override // tb.sqj.a
                public void a(MaterialDetail materialDetail, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c82d1e96", new Object[]{this, materialDetail, str, str2});
                    } else if (materialDetail == null) {
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("t_id", String.valueOf(materialDetail.getTid()));
                        new c("Page_GGTabs", "gg111.19920601").a("FunUpdateWaring", hashMap);
                    }
                }
            });
        }
        return true;
    }

    private void updateRemoteModulePublishParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66bfa0f", new Object[]{this, jSONObject});
        } else {
            jSONObject.put(KEY_IS_TAOPAI_REMOTE_MODULE, (Object) (isTaopaiRemote(this.mContext) ? "1" : "0"));
        }
    }

    private void openRecordAfterVersionChecked(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83770fd9", new Object[]{this, jSONObject});
        } else {
            openRecordActivity(jSONObject);
        }
    }

    private void openRecordActivity(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b394521f", new Object[]{this, jSONObject});
        } else if (!(this.mContext instanceof FragmentActivity) || checkFastClick()) {
        } else {
            String a2 = m.a(jSONObject, "biz_scene", "guangguang");
            Context a3 = acg.a();
            if (a3 == null) {
                a3 = this.mContext;
            }
            ten.a(a3, a2, new ten.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ten.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    }
                }

                @Override // tb.ten.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        UmiWvPlugin.access$1400(UmiWvPlugin.this, jSONObject);
                    }
                }
            });
        }
    }

    private void openRecordActivityAfterEnvReady(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de9e8e1", new Object[]{this, jSONObject});
            return;
        }
        String a2 = m.a(jSONObject, "biz_scene", "guangguang");
        boolean b = tek.b(a2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ior.f29193a, (Object) createSessionIdAndUrlParams(jSONObject));
        Uri a3 = ax.a(b ? NEW_RECORD_PATH_DIRECT : NEW_RECORD_PATH, jSONObject2);
        if (b) {
            openRecordDirectly(a3, a2);
            u.b(TAG, "UmiWvPlugin.startRecordRedirect");
            return;
        }
        startXgcActivity(null, a3);
        u.b(TAG, "UmiWvPlugin.startRecordNormal");
    }

    private void openRecordDirectly(Uri uri, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f812f4b9", new Object[]{this, uri, str});
            return;
        }
        Nav.from(this.mContext).toUri(uri);
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                if (intent.getBooleanExtra("publish_success", true)) {
                    r rVar = new r();
                    icc.a(intent, rVar);
                    UmiWvPlugin.access$1500(UmiWvPlugin.this, intent, rVar);
                    UmiWvPlugin.access$400(UmiWvPlugin.this).success(rVar);
                } else if (!TextUtils.equals("x_ask_everyone", str)) {
                    UmiWvPlugin.access$1600(UmiWvPlugin.this, com.alibaba.ability.localization.b.a(R.string.gg_pub_error_occurred_retry));
                }
                LocalBroadcastManager.getInstance(UmiWvPlugin.access$1700(UmiWvPlugin.this)).unregisterReceiver(this);
            }
        }, new IntentFilter("xgc_result"));
    }

    private String createSessionIdAndUrlParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7db3294a", new Object[]{this, jSONObject});
        }
        String uuid = UUID.randomUUID().toString();
        ios.a aVar = new ios.a();
        aVar.a(jSONObject);
        aVar.a().put(ior.f29193a, uuid);
        ios.a(uuid, aVar);
        return uuid;
    }

    private void updateSimplePublishParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2770a82f", new Object[]{this, jSONObject});
        } else {
            jSONObject.put(KEY_XGC_SIMPLE_PUBLISH, (Object) (tek.n() ? "1" : "0"));
        }
    }

    private void addEnableImageMusicFlagIfNeed(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f0d8bc", new Object[]{this, jSONObject});
        } else if (jSONObject.containsKey(ios.KEY_ENABLE_IMAGE_MUSIC)) {
        } else {
            jSONObject.put(ios.KEY_ENABLE_IMAGE_MUSIC, (Object) (tek.d(jSONObject.getString("biz_scene")) ? "1" : "0"));
        }
    }

    private boolean openPublish(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b793445", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        jSONObject.put("xgc", "1");
        updateSimplePublishParams(jSONObject);
        addEnableImageMusicFlagIfNeed(jSONObject);
        if (openPublishByImportMedias(jSONObject, wVCallBackContext)) {
            return true;
        }
        open(NEW_PUBLISH_PATH, jSONObject);
        return true;
    }

    private boolean openPublishByImportMedias(final JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b39203a", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        boolean containsKey = jSONObject.containsKey(KEY_IMPORT_PICS);
        boolean containsKey2 = jSONObject.containsKey(KEY_IMPORT_PIC_BASE_64);
        if (!(containsKey || containsKey2)) {
            return false;
        }
        getImportMediasList(containsKey, containsKey2, jSONObject, new rdz<JSONArray>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rdz
            public void a(JSONArray jSONArray) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                } else {
                    UmiWvPlugin.access$1800(UmiWvPlugin.this, jSONObject, jSONArray, wVCallBackContext);
                }
            }
        });
        return true;
    }

    private void getImportMediasList(boolean z, boolean z2, JSONObject jSONObject, final rdz<JSONArray> rdzVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345fba29", new Object[]{this, new Boolean(z), new Boolean(z2), jSONObject, rdzVar});
            return;
        }
        final JSONArray jSONArray2 = new JSONArray();
        if (z && (jSONArray = jSONObject.getJSONArray(KEY_IMPORT_PICS)) != null && jSONArray.size() > 0) {
            jSONArray2.addAll(jSONArray);
        }
        if (z2) {
            final String string = jSONObject.getString(KEY_IMPORT_PIC_BASE_64);
            au.a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String a2 = rcy.a(UmiWvPlugin.access$1900(UmiWvPlugin.this), string);
                    if (!k.e(a2)) {
                        return;
                    }
                    jSONArray2.add(a2);
                }
            }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rdzVar.a(jSONArray2);
                    }
                }
            });
            return;
        }
        rdzVar.a(jSONArray2);
    }

    private void startOpenPublishWithMedias(JSONObject jSONObject, JSONArray jSONArray, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f6cb6", new Object[]{this, jSONObject, jSONArray, wVCallBackContext});
            return;
        }
        jSONObject.remove(KEY_IMPORT_PICS);
        jSONObject.remove(KEY_IMPORT_PIC_BASE_64);
        if (jSONArray.size() > 0) {
            jSONObject.put(KEY_IS_IMPORT_MEDIA_MODE, "1");
            openPublishWithImportMedias(jSONObject, jSONArray, wVCallBackContext);
            return;
        }
        notifyError(wVCallBackContext, com.alibaba.ability.localization.b.a(R.string.gg_pub_media_data_incorrect));
    }

    private void openPublishWithImportMedias(JSONObject jSONObject, JSONArray jSONArray, WVCallBackContext wVCallBackContext) {
        UGCImage createUGCImage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231cff8f", new Object[]{this, jSONObject, jSONArray, wVCallBackContext});
            return;
        }
        UGCMedia uGCMedia = new UGCMedia();
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (!TextUtils.isEmpty(string) && (createUGCImage = createUGCImage(string)) != null) {
                uGCMedia.appendImage(createUGCImage);
            }
        }
        if (uGCMedia.getImages().size() <= 0) {
            notifyError(wVCallBackContext, com.alibaba.ability.localization.b.a(R.string.gg_pub_media_data_incorrect));
            return;
        }
        Uri.Builder buildUpon = Uri.parse(NEW_PUBLISH_PATH).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        Uri build = buildUpon.build();
        uGCMedia.initPublishSessionId(build);
        ios.a(uGCMedia.getPublishSessionId(), build);
        Bundle bundle = new Bundle();
        bundle.putSerializable(IWorkflowData.KEY, uGCMedia);
        Nav.from(this.mContext).withExtras(bundle).toUri(build);
    }

    public static UGCImage createUGCImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("464c1d13", new Object[]{str});
        }
        ImageBean a2 = g.a(str);
        if (a2 == null) {
            return null;
        }
        UGCImage uGCImage = new UGCImage();
        uGCImage.origin = a2;
        uGCImage.compress = uGCImage.origin;
        return uGCImage;
    }

    private boolean open(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fed64f9", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (!(this.mContext instanceof FragmentActivity) || checkFastClick()) {
            return true;
        }
        return startXgcActivity(null, ax.a(str, jSONObject));
    }

    private boolean checkFastClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7ececef", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - sLastOpenTime < tek.o()) {
            return true;
        }
        sLastOpenTime = elapsedRealtime;
        return false;
    }

    private boolean startXgcActivity(Bundle bundle, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f731afbf", new Object[]{this, bundle, uri})).booleanValue() : startXgcActivity(bundle, uri, false);
    }

    private boolean startXgcActivity(Bundle bundle, Uri uri, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef04fa7d", new Object[]{this, bundle, uri, new Boolean(z)})).booleanValue();
        }
        Nav.from(this.mContext).withExtras(bundle).toUri(uri);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("xgc_result");
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                if (intent.getBooleanExtra("publish_success", true)) {
                    r rVar = new r();
                    icc.a(intent, rVar);
                    UmiWvPlugin.access$1500(UmiWvPlugin.this, intent, rVar);
                    String str = "wvplugin callback: " + rVar;
                    UmiWvPlugin.access$400(UmiWvPlugin.this).success(rVar);
                } else if (z) {
                    r rVar2 = new r();
                    UmiWvPlugin.access$1500(UmiWvPlugin.this, intent, rVar2);
                    if (UmiWvPlugin.access$400(UmiWvPlugin.this) != null) {
                        UmiWvPlugin.access$400(UmiWvPlugin.this).success(rVar2);
                    }
                    String str2 = "wvplugin callback: " + rVar2;
                } else if (UmiWvPlugin.access$400(UmiWvPlugin.this) != null) {
                    UmiWvPlugin.access$400(UmiWvPlugin.this).error(reh.a("-2", com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED));
                }
                LocalBroadcastManager.getInstance(UmiWvPlugin.access$2000(UmiWvPlugin.this)).unregisterReceiver(this);
            }
        }, intentFilter);
        return true;
    }

    private void putResultDataToWVResult(Intent intent, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57127", new Object[]{this, intent, rVar});
            return;
        }
        JSONObject parseObject = JSON.parseObject(intent.getStringExtra("umi_publish_result_data"));
        if (parseObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
            Object value = entry.getValue();
            rVar.a(entry.getKey(), value == null ? "" : value.toString());
        }
    }

    private boolean fetchDraftList(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd58ea28", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("biz")) {
            this.mWVCallBackContext.error(new r("参数缺失"));
            return true;
        }
        com.taobao.umipublish.draft.b.a(this.mContext).a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (jSONObject.containsKey(ios.KEY_IS_CONTENT_ULTRA) && jSONObject.getInteger(ios.KEY_IS_CONTENT_ULTRA).intValue() == 1) {
                    z = true;
                }
                final org.json.JSONObject access$2200 = UmiWvPlugin.access$2200(UmiWvPlugin.this, com.taobao.umipublish.draft.b.a(UmiWvPlugin.access$2100(UmiWvPlugin.this)).a(jSONObject.getString("biz"), z));
                UmiWvPlugin.access$2300(UmiWvPlugin.this).post(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.24.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        r rVar = new r();
                        rVar.a(access$2200);
                        rVar.a("HY_SUCCESS");
                        UmiWvPlugin.access$400(UmiWvPlugin.this).success(rVar);
                    }
                });
            }
        });
        return true;
    }

    private void openSimpleRecord(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9971f099", new Object[]{this, jSONObject, wVCallBackContext});
        } else {
            autoFillConfig(this.mContext, jSONObject, new rdz<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.25
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rdz
                public void a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    } else if (jSONObject2 == null) {
                    } else {
                        UmiWvPlugin.access$000(UmiWvPlugin.this, jSONObject2);
                        LocalBroadcastManager.getInstance(UmiWvPlugin.access$2600(UmiWvPlugin.this)).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.25.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context, Intent intent) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                                    return;
                                }
                                UmiWvPlugin.access$2400(UmiWvPlugin.this, intent, wVCallBackContext);
                                LocalBroadcastManager.getInstance(UmiWvPlugin.access$2500(UmiWvPlugin.this)).unregisterReceiver(this);
                            }
                        }, new IntentFilter("xgc_media_export_data_change"));
                    }
                }
            });
        }
    }

    private org.json.JSONObject draftModelsToJsonObj(Collection<DraftModel> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("5b367cef", new Object[]{this, collection});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (collection != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (DraftModel draftModel : collection) {
                    if (!TextUtils.equals(com.taobao.umipublish.ayscpublish.c.a().f23232a, draftModel.draftId) && (draftModel.meta == null || !TextUtils.equals(draftModel.meta.mode, "lite") || tek.k())) {
                        if (draftModel.meta == null || !TextUtils.equals(draftModel.meta.mode, "quick") || s.u()) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(JSON.toJSONString(draftModel.meta));
                            jSONObject2.put("biz", draftModel.biz);
                            jSONObject2.put("draftId", draftModel.draftId);
                            jSONObject2.put("timestamp", draftModel.modificationTimestamp);
                            jSONObject2.put("version", draftModel.version);
                            jSONObject2.put("failedCode", draftModel.failedCode);
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
                jSONObject.put("drafts", jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private void initUseXgcScenes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa86bcb", new Object[]{this});
        } else {
            sUseXgcScenes = OrangeConfig.getInstance().getConfig("umipublish", "use_xgc_scenes", "guangguang");
        }
    }

    private boolean openDraft(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65075036", new Object[]{this, jSONObject})).booleanValue();
        }
        if (checkFastClick()) {
            return true;
        }
        initUseXgcScenes();
        if (jSONObject == null || !jSONObject.containsKey("biz") || !jSONObject.containsKey("draftId")) {
            this.mWVCallBackContext.error(new r("参数缺失"));
            return true;
        }
        Context a2 = acg.a();
        if (a2 == null) {
            a2 = this.mContext;
        }
        ten.a(a2, "guangguang", new ten.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ten.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                }
            }

            @Override // tb.ten.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    UmiWvPlugin.access$2700(UmiWvPlugin.this, jSONObject.getString("biz"), jSONObject.getString("draftId"), new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.26.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                UmiWvPlugin.access$400(UmiWvPlugin.this).success(new r());
                            }
                        }
                    }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.26.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                UmiWvPlugin.access$400(UmiWvPlugin.this).error(new r("草稿打开失败"));
                            }
                        }
                    });
                }
            }
        });
        return true;
    }

    private void doOpenDraft(final String str, final String str2, final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0dfe43", new Object[]{this, str, str2, runnable, runnable2});
        } else {
            com.taobao.umipublish.draft.b.a(this.mContext).a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.27
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final DraftModel a2 = com.taobao.umipublish.draft.b.a(UmiWvPlugin.access$2800(UmiWvPlugin.this)).a(str, str2);
                    if (a2 != null) {
                        au.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.27.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                String str3 = a2.meta != null ? a2.meta.mode : "";
                                if (TextUtils.equals(str3, "lite")) {
                                    UmiWvPlugin.access$2900(UmiWvPlugin.this, a2, runnable, runnable2);
                                } else if (TextUtils.equals(str3, "quick")) {
                                    UmiWvPlugin.access$3000(UmiWvPlugin.this, a2, runnable, runnable2);
                                } else {
                                    UmiWvPlugin.access$3100(UmiWvPlugin.this, a2);
                                }
                            }
                        });
                        au.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.27.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (runnable == null) {
                                } else {
                                    runnable.run();
                                }
                            }
                        });
                    } else if (runnable2 == null) {
                    } else {
                        UmiWvPlugin.access$2300(UmiWvPlugin.this).post(runnable2);
                    }
                }
            });
        }
    }

    private void openLitePublish(DraftModel draftModel, final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d7d6f5", new Object[]{this, draftModel, runnable, runnable2});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(draftModel.rawJson);
        if (parseObject == null) {
            if (runnable2 == null) {
                return;
            }
            runnable2.run();
            return;
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        if (jSONObject != null) {
            setDraftId(jSONObject, draftModel.draftId);
        }
        QuickPreviewAbility quickPreviewAbility = new QuickPreviewAbility();
        quickPreviewAbility.setContext(this.mContext);
        quickPreviewAbility.setListener(new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                Runnable runnable3 = runnable;
                if (runnable3 == null) {
                    return;
                }
                runnable3.run();
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                Runnable runnable3 = runnable2;
                if (runnable3 == null) {
                    return;
                }
                runnable3.run();
            }
        });
        quickPreviewAbility.execute(parseObject);
    }

    private static void setDraftId(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7777b9", new Object[]{jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            jSONObject.put("draftId", (Object) str);
        }
    }

    private void openVideoEdit(DraftModel draftModel, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a55719", new Object[]{this, draftModel, runnable, runnable2});
        } else if (draftModel == null || draftModel.urlParams == null || TextUtils.isEmpty(draftModel.rawJson)) {
            runnable2.run();
        } else {
            Uri a2 = ax.a(VIDEO_EDIT_PATH, draftModel.urlParams);
            UGCMedia deserialization = deserialization(draftModel.rawJson);
            deserialization.setMeta("draftId", draftModel.draftId);
            deserialization.setMeta("onlyQuickPublishMode", true);
            Bundle bundle = new Bundle();
            bundle.putSerializable(IWorkflowData.KEY, deserialization);
            Nav.from(this.mContext).withExtras(bundle).toUri(a2);
            runnable.run();
        }
    }

    private void openMainPublish(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891d870e", new Object[]{this, draftModel});
            return;
        }
        final Uri.Builder buildUpon = Uri.parse(NEW_PUBLISH_PATH).buildUpon();
        for (Map.Entry<String, String> entry : draftModel.urlParams.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String str = "1";
        buildUpon.appendQueryParameter("xgc", str);
        buildUpon.appendQueryParameter("is_native_draft", str);
        if (!tek.n()) {
            str = "0";
        }
        buildUpon.appendQueryParameter(KEY_XGC_SIMPLE_PUBLISH, str);
        final Bundle bundle = new Bundle();
        bundle.putString(com.taobao.umipublish.draft.b.DRAFT_URL_KEY, draftModel.toString());
        this.mMainHandler.post(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Nav.from(UmiWvPlugin.access$3200(UmiWvPlugin.this)).withExtras(bundle).toUri(buildUpon.build());
                }
            }
        });
    }

    private boolean deleteDraft(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9de657", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("biz") || !jSONObject.containsKey(com.taobao.umipublish.draft.b.KEY_DRAFT_IDS)) {
            this.mWVCallBackContext.error(new r("参数缺失"));
            return true;
        }
        com.taobao.umipublish.draft.b.a(this.mContext).a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final c.a a2 = com.taobao.umipublish.draft.b.a(UmiWvPlugin.access$3300(UmiWvPlugin.this)).a(jSONObject.getString("biz"), jSONObject.getJSONArray(com.taobao.umipublish.draft.b.KEY_DRAFT_IDS));
                UmiWvPlugin.access$2300(UmiWvPlugin.this).post(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.30.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (a2.c) {
                            UmiWvPlugin.access$400(UmiWvPlugin.this).success(new r("删除成功"));
                        } else {
                            UmiWvPlugin.access$400(UmiWvPlugin.this).error(new r("删除失败"));
                        }
                    }
                });
            }
        });
        return true;
    }

    private void handleAskEveryoneData(Intent intent, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f2607", new Object[]{this, intent, wVCallBackContext});
            return;
        }
        String stringExtra = intent.getStringExtra("UGCMediaData");
        if (TextUtils.isEmpty(stringExtra)) {
            wVCallBackContext.error();
            u.d(TAG, "handleAskEveryoneData fail, UGCMediaData is empty");
            return;
        }
        org.json.JSONObject jSONObject = null;
        try {
            jSONObject = new org.json.JSONObject(stringExtra);
        } catch (Exception e) {
            wVCallBackContext.error();
            u.d(TAG, Log.getStackTraceString(e));
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            wVCallBackContext.error();
            u.d(TAG, "handleAskEveryoneData fail, ugcMediaDataJson is empty");
        } else if (wVCallBackContext == null) {
            u.d(TAG, "handleAskEveryoneData fail, wvCallBackContext is null");
        } else {
            r rVar = new r("HY_SUCCESS");
            rVar.a(jSONObject);
            wVCallBackContext.success(rVar);
            u.d(TAG, "handleAskEveryoneData success, data = " + jSONObject);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static com.taobao.android.litecreator.base.data.UGCMedia deserialization(java.lang.String r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.umipublish.extension.windvane.UmiWvPlugin.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            java.lang.String r3 = "ee4d7ad3"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            com.taobao.android.litecreator.base.data.UGCMedia r3 = (com.taobao.android.litecreator.base.data.UGCMedia) r3
            return r3
        L15:
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r3, r2)     // Catch: java.lang.Throwable -> L38
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L38
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r1.readObject()     // Catch: java.lang.Throwable -> L39
            com.taobao.android.litecreator.base.data.UGCMedia r3 = (com.taobao.android.litecreator.base.data.UGCMedia) r3     // Catch: java.lang.Throwable -> L39
            r1.close()     // Catch: java.io.IOException -> L2d
        L2d:
            return r3
        L2e:
            r3 = move-exception
            r0 = r1
            goto L32
        L31:
            r3 = move-exception
        L32:
            if (r0 == 0) goto L37
            r0.close()     // Catch: java.io.IOException -> L37
        L37:
            throw r3
        L38:
            r1 = r0
        L39:
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L3e
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.extension.windvane.UmiWvPlugin.deserialization(java.lang.String):com.taobao.android.litecreator.base.data.UGCMedia");
    }
}

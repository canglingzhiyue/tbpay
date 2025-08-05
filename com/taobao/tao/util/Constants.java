package com.taobao.tao.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.util.k;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.d;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import tb.ewy;
import tb.kge;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

@Deprecated
/* loaded from: classes.dex */
public class Constants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAYUPDATEPATH = "alipayupdatapath";
    public static final String ALIPAY_APK_NAME = "mobile_sp.apk";
    public static final String ALIPAY_PARNER = "";
    public static int ALIPAY_REQUEST_CODE = 0;
    public static final String APKNAME = "/tao.apk";
    public static final String APKNEWCHANGE = "tao.apk-change";
    public static final String APKSIZE = "tao.apk-size";
    public static final Uri APN_URI;
    public static String APP_DIR = null;
    public static final String ATLAS = "atlas";
    public static final String AUCTION_TAG1 = "20482";
    public static final String AUCTION_TAG2 = "20546";
    public static final String AVAILABLE_ENV_ERR = "ENV_ERR";
    public static final String AVAILABLE_ERROR = "ERR";
    public static final String BACKUPDATE = "立即更新";
    public static final String BANNER_COUNT_PER = "bannercount";
    public static final String BANNER_KEY = "banner_key";
    public static final String BANNER_VALUE = "banner_value";
    public static final String CATEGORCATID = "categorycatid";
    public static final String CATEGORNAME = "categoryname";
    public static final String COMMEND_ANDROID = "commend_android";
    public static final String COMMEND_TAG = "commend_tag";
    public static final String COMMEND_TMALL = "commend_tmall";
    public static final String COMPLAINFAILED = "抱歉，您的反馈发送失败，请重新发送！";
    public static final String COMPLAININVALIDSID = "抱歉，请重新登录！";
    public static final String COMPLAINSUCCESS = "您的反馈我们已收到，感谢您对淘宝网客户端的关注和支持！";
    public static final String COUNT = "count";
    public static final Uri CURRENT_APN_URI;
    public static String CartlastTag = null;
    public static final String DEFAULT_CHARSET = "GBK";
    public static final int DETAILSWITCHRULE = 1;
    public static final String DUMP_RESOURCE = "taobaoandroiddumpresource";
    public static final String[] EMPTY_STRING_ARRAY;
    public static final int EVENT_ALLSPARK_ATTENTION_RESULT = 5003;
    public static final int EVENT_AVAILABLE = 4;
    public static final int EVENT_FROMLAIWANG_EVENT = 5004;
    public static final int EVENT_ID_EFFECT_TRACK = 23500;
    public static final int EVENT_ID_VIEW_ITEM_LBS = 20001;
    public static final int EVENT_YYZ_EVENT = 2101;
    public static final String EXITSHOWMESSAGE = "是否退出淘客户端？";
    public static int EventID_ATLAS_BLADE = 0;
    public static int EventID_ATLAS_DD_INSTALLERR = 0;
    public static int EventID_ATLAS_DD_LOADERR = 0;
    public static int EventID_ATLAS_DD_LOADTIME = 0;
    public static int EventID_ATLAS_PLUGIN_DEGRADE = 0;
    public static int EventID_ATLAS_PLUGIN_START = 0;
    public static int EventID_ATLAS_REDUCE_IN_RANK = 0;
    private static final int EventID_BASE_OFFSET_TWC = 21000;
    public static int EventID_BIZ_AVAILABLE = 0;
    public static int EventID_EVENT_TIME = 0;
    public static int EventID_EXTERN_URL = 0;
    public static int EventID_FEED_DETAIL_PERFORMACE = 0;
    public static int EventID_FRIST_LOGIN = 0;
    public static int EventID_GOOGLE_SERVER = 0;
    public static int EventID_H5_APPCACHE = 0;
    public static int EventID_H5_FREEMEMORY = 0;
    public static int EventID_H5_PERFORMACE = 0;
    public static int EventID_HOTPATCH_STATS = 0;
    public static int EventID_HTTPS_DEGRADE = 0;
    public static int EventID_LAUNCH_PERFORMACE = 0;
    public static int EventID_MAX_MEMORY = 0;
    public static int EventID_NAVIGATION = 0;
    public static int EventID_NAVI_PAGE = 0;
    public static int EventID_NETWORK_OBJECT = 0;
    public static int EventID_NETWORK_OBJECT_UNIFORM = 0;
    public static int EventID_PERSITCON = 0;
    public static int EventID_RD_TRACE = 0;
    public static int EventID_REFLECT_METHOD_FAILED_EVENT_ID = 0;
    public static int EventID_REFLECT_METHOD_SUCCEED_EVENT_ID = 0;
    public static int EventID_SO_INIT = 0;
    public static int EventID_SSO_EXCEPTION = 0;
    public static int EventID_SSO_HOST = 0;
    public static int EventID_STAT_1010 = 0;
    public static int EventID_SWITCH_PERFORMACE = 0;
    public static int EventID_TRAFFIC_STATS = 0;
    public static int EventID_VIP_EVENT = 0;
    public static int EventID_WINDVANE = 0;
    public static final int FALSESWITCHRULE = 2;
    public static final String FIELDLIST = "item_id,long_name,short_name,original_price,pic_url,activity_price,item_status,discount,sold_count,pic_url_from_ic,online_start_time,online_end_time";
    public static final int FILECHOOSER_REQ_CODE = 2688;
    public static final String ID = "id";
    public static final int INVALCARTITEM_REQUEST_CODE = 101;
    public static final String KEY_AD_BANNER_URL = "ad_banner_url";
    public static final String KEY_AD_COOKIE = "ad_cookie";
    public static final String KEY_AD_WORD_SEARCH = "ad_word_search";
    public static final String KEY_AD_WORD_SHOW = "ad_word_show";
    public static final String KEY_COMPONENT_ID = "component_id";
    public static final String KEY_CONTENT_CHANGE_ITEM_DETAIL = "item_detail";
    public static final String KEY_CONTENT_CHANGE_SHOP_ITEM_LIST = "shop_itemlist";
    public static final String KEY_CONTENT_CHANGE_SHOP_ITEM_SORT = "shop_itemsort";
    public static final String KEY_FEED_ID = "feed_id";
    public static final String KEY_FROM_NOTIFICATION = "itent_from_notification";
    public static final String KEY_ITEM_ID = "item_id";
    public static final String KEY_MSG_PUSH_MSGS = "intent_msg_push_msgs";
    public static final String KEY_MSG_PUSH_TASK_ID = "intent_msg_push_task_id";
    public static final String KEY_MY_COMPONENT_TAB_ID = "tab";
    public static final String KEY_ORDER_ID = "order_id";
    public static final String KEY_PROMPTION_TITLE = "title";
    public static final String KEY_SEARCH_ACTION = "search_action";
    public static final String KEY_SEARCH_KEYWORD = "search_keyword";
    public static final String KEY_SELLER_ID = "seller_id";
    public static final String KEY_SHOP_ID = "shop_id";
    public static final String KEY_SNS_ID = "sns_id";
    public static final String KEY_USER_ID = "user_id";
    public static final String KEY_WIDGET_WEITAO_CLICK = "widget_weitao_click";
    public static final String KEY_WIDGET_WEITAO_LOGIN = "widget_weitao_login";
    public static final String LAST_VERSION = "lastversion";
    public static String LBSCurCity = null;
    public static final int LISTSWITCHRULE = 0;
    public static final String LOGCLOSE = "taobaoandroidlogclose";
    public static final String LOGOPEN = "taobaoandroidlogopen";
    public static final String MYBROWSERHIDETITLE = "myBrowserHideTitle";
    public static final String MYBROWSERTITLE = "myBrowserTitle";
    public static final String MYBROWSERURL = "myBrowserUrl";
    public static final String NAME = "name";
    public static final String NETWORK_ERROR_CHARGE = "1";
    public static final int NOTCLEARHISTORYLISTSWITCHRULE = 4;
    public static final String NOTICE_CHANGE_PSD_FAIL = "5";
    public static final String NOTICE_CHANGE_PSD_SUCCESS = "2";
    public static final String NOTICE_CONNECTO_SERVER_ERROR = "1";
    public static final String NOTICE_ERRORTIP_CHGPSD = "4";
    public static final String NOTICE_LOGIN_INFO_INVALIDATE = "3";
    public static final String NO_ITEM_CHARGE = "2";
    public static final int ORDERLISTSWITCHRULE = 3;
    public static final String PicSeparator = "|";
    public static final String REDIRECT_KEYWORD = "redirectURL";
    public static String SAVE_FILE_ROOT_DIR = null;
    public static int SCREEN_HEIGHT_OFFSET = 0;
    public static long SD_MIN_LIMIT = 0;
    public static final String SEARCH_FROM = "search_from";
    public static final String SEARCH_KEYWORD = "search";
    public static final String SEARCH_LOC = "search_loc";
    public static final String SEARCH_TYPE = "search_type";
    public static final String SETFOCUSED = "Focused";
    public static final String SHAREKEY = "?nativef2e";
    public static final String SHARETYPE = "text/plain";
    public static final String SHARETYPE_WITH_QRCODE = "image/png";
    public static final String SHOWTEXTSTR = "showTextStr";
    public static final String SID = "sid";
    public static final String SIDW = "sid=";
    public static final String SINAWEIBOAPPKEYDESKEY = "sinadesedekey";
    public static final String SPEN_DIALOG = "spen_dialog";
    public static final String SPEN_DIALOG_CLICK_BTN_AIR = "spen_dialog_click_btn_air";
    public static final String SPEN_DIALOG_CLICK_BTN_COMMENT = "spen_dialog_click_btn_comment";
    public static final String SPEN_DIALOG_CLICK_BTN_FAV = "spen_dialog_click_btn_fav";
    public static final String SPEN_DIALOG_CLICK_BTN_WANGWANG = "spen_dialog_click_btn_wangwang";
    public static final String SPEN_DIALOG_CLICK_IMAGE = "spen_dialog_click_image";
    public static final String SWITCHRULESTYLE = "switchrulestyle";
    public static final String TAOBAOUPDATEURL = "taobaoupdataurl";
    public static final String TAOBAO_IMAGE_CDN = "http://img.taobaocdn.com/bao/uploaded/";
    public static final String TAOBAO_IMAGE_DATA = "taobao_image_data";
    public static final String TBSettingsPrefernceKey = "tbsettings";
    public static final int TITLENUM = 10;
    public static final String TTIDKEY = "taobaoandroidttidkey";
    public static final String[] TTID_LEPHONE_T;
    public static final int TYPE_SEARCH_FROM_COUPON = 3;
    public static final String UPDATENOMEMORY = "抱歉，您的手机存储空间不够，请清理存储空间后重新下载！";
    public static final String UPDATE_TIP_SETTING = "tip_num";
    public static final String USERAGENTSTR = "anclient";
    public static final String USERINFO = "userinfo";
    public static final String UpdateKey = "tao_apk";
    public static final String VERSION = "*";
    public static final String Xm = "X:";
    public static String appkey = null;
    public static boolean exitFlag = false;
    public static int half_screen_width = 0;
    public static final int loginTitleMoveX = 20;
    public static final int loginTitleTime = 100;
    public static final int navigationbar_height = 52;
    public static boolean openShakeForLottery;
    public static String[] projection;
    public static float screen_density;
    public static int screen_height;
    public static int screen_width;
    public static int screen_widthmul2;
    public static View showInput;
    public static int statusBarHeight;
    public static int titleHeight;

    public static int getABS(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc53f93", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = i >> 31;
        return (i + i2) ^ i2;
    }

    public static int percent(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("938ed33f", new Object[]{new Float(f), new Float(f2)})).intValue() : (int) ((f / f2) * 100.0f);
    }

    static {
        kge.a(-1789009694);
        titleHeight = -1;
        exitFlag = false;
        APN_URI = Uri.parse("content://telephony/carriers/current");
        CURRENT_APN_URI = Uri.parse("content://telephony/carriers/preferapn");
        projection = new String[]{"_id,name,apn,user,password,mmsc,mcc,mnc"};
        APP_DIR = "taobao";
        SAVE_FILE_ROOT_DIR = "taobao";
        SD_MIN_LIMIT = 20971520L;
        LBSCurCity = "";
        EMPTY_STRING_ARRAY = new String[0];
        ALIPAY_REQUEST_CODE = 1;
        TTID_LEPHONE_T = new String[]{"10220a", "203200"};
        appkey = BuiltConfig.getString(R.string.appkey);
        EventID_NAVI_PAGE = ewy.T_DETAIL;
        EventID_PERSITCON = ewy.T_DETAIL_NAVI_BAR;
        EventID_RD_TRACE = 21003;
        EventID_ATLAS_REDUCE_IN_RANK = 21004;
        EventID_REFLECT_METHOD_FAILED_EVENT_ID = 21005;
        EventID_REFLECT_METHOD_SUCCEED_EVENT_ID = 21006;
        EventID_SSO_EXCEPTION = 21007;
        EventID_HTTPS_DEGRADE = 21008;
        EventID_ATLAS_DD_LOADERR = 21009;
        EventID_ATLAS_DD_LOADTIME = 21010;
        EventID_ATLAS_DD_INSTALLERR = 21011;
        EventID_MAX_MEMORY = 21012;
        EventID_ATLAS_PLUGIN_START = TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_DECODE_DELAY_MS;
        EventID_ATLAS_PLUGIN_DEGRADE = TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_TOTAL_DECODE_DELAY_MS;
        EventID_SSO_HOST = TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_RENDER_DELAY_MS;
        EventID_GOOGLE_SERVER = 21020;
        EventID_H5_PERFORMACE = 21025;
        EventID_LAUNCH_PERFORMACE = 21028;
        EventID_SWITCH_PERFORMACE = 21029;
        EventID_FEED_DETAIL_PERFORMACE = 21030;
        EventID_VIP_EVENT = 21031;
        EventID_NAVIGATION = 21032;
        EventID_SO_INIT = 21033;
        EventID_EVENT_TIME = d.EVENT_ID_TIME;
        EventID_EXTERN_URL = 21035;
        EventID_H5_APPCACHE = 21040;
        EventID_H5_FREEMEMORY = 21041;
        EventID_WINDVANE = 21042;
        EventID_STAT_1010 = 21050;
        EventID_FRIST_LOGIN = 21061;
        EventID_TRAFFIC_STATS = 21062;
        EventID_ATLAS_BLADE = 21063;
        EventID_HOTPATCH_STATS = 21064;
        EventID_BIZ_AVAILABLE = 30001;
        EventID_NETWORK_OBJECT_UNIFORM = 26690;
        EventID_NETWORK_OBJECT = 64301;
        CartlastTag = "";
        openShakeForLottery = false;
    }

    public static final String getUrlSid(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2f5a0ba", new Object[]{str});
        }
        if (str == null || (indexOf = str.indexOf(SIDW)) == -1) {
            return "";
        }
        String substring = str.substring(indexOf);
        int indexOf2 = substring.indexOf("&");
        if (indexOf2 != -1) {
            return substring.substring(4, indexOf2);
        }
        return substring.substring(4);
    }

    public static String replaceParam(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e4e1c42", new Object[]{str, str2, str3});
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(str2);
            if (queryParameter == null) {
                Uri.Builder buildUpon = parse.buildUpon();
                String path = parse.getPath();
                if (path == null || path.length() == 0) {
                    buildUpon.appendPath("");
                }
                return buildUpon.appendQueryParameter(str2, str3).toString();
            } else if ("".equals(queryParameter)) {
                return str.replace(str2 + "=", str2 + "=" + str3);
            } else {
                return str.replace(queryParameter, str3);
            }
        } catch (Exception e) {
            k.a(k.TAOBAO_TAG, "" + e.getMessage());
            return str;
        }
    }

    public static final String changeUrlSid(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e044a16", new Object[]{str, str2}) : (str == null || str2 == null || str2.length() == 0) ? str : replaceParam(str, "sid", str2);
    }

    public static final boolean isIndex(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb1822a", new Object[]{str, strArr})).booleanValue();
        }
        if (str != null && strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr[i] != null && str.indexOf(strArr[i]) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isRegularIndex(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa3c612", new Object[]{str, strArr})).booleanValue();
        }
        if (str != null && strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr[i] != null && str.matches(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String isParameter(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2748d326", new Object[]{str, str2});
        }
        if (str.indexOf("ttid=") != -1) {
            return str;
        }
        if (str.indexOf("?") != -1) {
            str3 = "&" + str2;
        } else {
            str3 = "?" + str2;
        }
        return str + str3;
    }

    public static final String isXnParameter(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34debe3c", new Object[]{str, str2});
        }
        if (str.indexOf("xn=") != -1) {
            return str;
        }
        if (str.indexOf("?") != -1) {
            str3 = "&" + str2;
        } else {
            str3 = "?" + str2;
        }
        return str + str3;
    }

    public static final String isAjaxPortParameter(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a89dfc7", new Object[]{str, str2});
        }
        if (str.indexOf("ajaxport=") != -1) {
            return str;
        }
        if (str.indexOf("?") != -1) {
            str3 = "&" + str2;
        } else {
            str3 = "?" + str2;
        }
        return str + str3;
    }

    public static final String getItemParam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a13d568f", new Object[]{obj, str}) : (String) ((HashMap) obj).get(str);
    }

    @Deprecated
    public static final void showToast(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df8d1", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        String string = Globals.getApplication().getString(i);
        Toast makeText = Toast.makeText(Globals.getApplication(), "", i2);
        makeText.setText(string);
        makeText.show();
    }

    @Deprecated
    public static final void showToast(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
            return;
        }
        try {
            Toast makeText = Toast.makeText(Globals.getApplication(), "", 0);
            makeText.setText(str);
            makeText.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Deprecated
    public static final void showToast(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994b0ce2", new Object[]{context, str, new Integer(i)});
            return;
        }
        Toast makeText = Toast.makeText(Globals.getApplication(), "", i);
        makeText.setText(str);
        makeText.show();
    }

    @Deprecated
    public static final void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{str});
        } else {
            showToast((Context) null, str);
        }
    }

    @Deprecated
    public static final void showToast(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42438872", new Object[]{new Integer(i)});
        } else {
            showToast(Globals.getApplication().getString(i));
        }
    }

    public static final String getMidStr(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af51c4fc", new Object[]{str, str2, str3});
        }
        try {
            String substring = str.substring(str.indexOf(str2) + str2.length());
            return substring.substring(0, substring.indexOf(str3));
        } catch (Exception unused) {
            return str;
        }
    }

    public static void write(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52164349", new Object[]{str, str2, new Integer(i)});
            return;
        }
        FileWriter fileWriter = null;
        if (str == null) {
            return;
        }
        try {
            if (str.length() <= 0) {
                return;
            }
            FileWriter fileWriter2 = new FileWriter(Globals.getApplication().getCacheDir().toString() + "/" + str2, true);
            try {
                fileWriter2.write(str);
                try {
                    fileWriter2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception unused) {
                fileWriter = fileWriter2;
                if (fileWriter == null) {
                    return;
                }
                try {
                    fileWriter.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[0]);
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return format + " ";
    }

    public static boolean retrieveApkFromAssets(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8ab9f2c", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            File file = new File(str2);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = proxy_open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    proxy_open.close();
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void chmod(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0c4598", new Object[]{str, str2});
            return;
        }
        try {
            Runtime.getRuntime().exec("chmod " + str + " " + str2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isExistAlipayApkInAssests(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92f31b61", new Object[]{context})).booleanValue();
        }
        try {
            for (String str : AssetsDelegate.proxy_list(context.getAssets(), "")) {
                if (str.equals(ALIPAY_APK_NAME)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void myLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61781813", new Object[]{str, str2});
            return;
        }
        String str3 = str + "";
        String str4 = str2 + "";
    }

    public static int percent(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93903b9f", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i * 100) / i2;
    }

    public static int touchLen(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25b0d4f0", new Object[]{new Integer(i), new Integer(i2)})).intValue() : getABS(i - i2);
    }

    public static String addBoughtListParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e9e71cc", new Object[]{str});
        }
        if (str.indexOf("&client_orderlist=androidtaobao") >= 0) {
            return "&client_orderlist=androidtaobao";
        }
        return str + "&client_orderlist=androidtaobao";
    }

    public static boolean isEmpty(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcaeceaa", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return true;
        }
        return (obj instanceof String) && ((String) obj).equals("");
    }

    public static boolean isNotEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7d8dd19", new Object[]{str})).booleanValue() : str != null && !"".equals(str);
    }

    public static boolean isEmpty(ArrayList<Object> arrayList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6628cea4", new Object[]{arrayList})).booleanValue() : arrayList == null || arrayList.size() == 0;
    }

    public static boolean isNotEmpty(ArrayList<Object> arrayList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a81a1e83", new Object[]{arrayList})).booleanValue() : (arrayList == null || arrayList.size() == 0) ? false : true;
    }

    public static void shareByIntent(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfb42f5", new Object[]{str, activity});
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(SHARETYPE);
            intent.putExtra("android.intent.extra.TEXT", str);
            activity.startActivity(Intent.createChooser(intent, "分享"));
        } catch (Exception e) {
            Toast makeText = Toast.makeText(Globals.getApplication(), "无分享内容", 5000);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            e.printStackTrace();
        }
    }

    public static boolean isIntentAvailable(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4020914c", new Object[]{context, str})).booleanValue() : context.getPackageManager().queryIntentActivities(new Intent(str), 65536).size() > 0;
    }

    public static String getResourceStr(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52a98711", new Object[]{new Integer(i)}) : Globals.getApplication().getString(i);
    }
}

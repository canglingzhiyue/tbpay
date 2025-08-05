package com.etao.feimagesearch;

import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_URL_PRE_1 = "http://item.taobao.com/item.htm";
    public static final String DETAIL_URL_PRE_1s = "https://item.taobao.com/item.htm";
    public static final String DETAIL_URL_PRE_2 = "http://a.m.taobao.com/";
    public static final String DETAIL_URL_PRE_2s = "https://a.m.taobao.com/";
    public static final int ERROR_DECODE_FAILED = -3;
    public static final int ERROR_DOWNLOAD_FAILED = -4;
    public static final int ERROR_EMPTY_PATH = -2;
    public static final int ERROR_INVALID_CHANNEL = -7;
    public static final int ERROR_TOO_SMALL = -5;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UPLOAD_FAILED = -6;
    public static final int MSG_FILE_UPLOAD_FAILED = 30001;
    public static final int MSG_FILE_UPLOAD_SUCCESS = 30000;
    public static final int PERMISSION_TYPE_ALBUM = 1;
    public static final int PERMISSION_TYPE_CAMERA = 0;
    public static final String REGION_SCAN = "regionScan";
    public static final String REGION_SEARCH = "regionSearch";
    public static final String TIP_DECODE_FAILED;
    public static final String TIP_ERROR;
    public static final String TIP_IMAGE_DOWNLOAD_ERROR;
    public static final String TIP_IMAGE_UPLOAD_ERROR;
    public static final String TIP_NETWORK_OFFLINE;

    /* renamed from: a  reason: collision with root package name */
    public static int f6663a = 0;
    public static List<String> b = null;
    public static final String h5_daily = "http://wapp.waptest.taobao.com";
    public static final String h5_online = "http://h5.m.taobao.com";
    public static final String h5_pre = "http://wapp.wapa.taobao.com";

    static {
        kge.a(1617701916);
        TIP_ERROR = b.a(R.string.taobao_app_1007_1_19003);
        TIP_NETWORK_OFFLINE = b.a(R.string.taobao_app_1007_1_19025);
        TIP_IMAGE_UPLOAD_ERROR = b.a(R.string.taobao_app_1007_1_19007);
        TIP_DECODE_FAILED = b.a(R.string.taobao_app_1007_1_19016);
        TIP_IMAGE_DOWNLOAD_ERROR = b.a(R.string.taobao_app_1007_1_18998);
        f6663a = 2;
        LinkedList linkedList = new LinkedList();
        b = linkedList;
        linkedList.add(DETAIL_URL_PRE_1);
        b.add(DETAIL_URL_PRE_1s);
        b.add(DETAIL_URL_PRE_2);
        b.add(DETAIL_URL_PRE_2s);
        b.add("http://s.taobao.com/search?");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}

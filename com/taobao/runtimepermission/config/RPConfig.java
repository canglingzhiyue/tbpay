package com.taobao.runtimepermission.config;

import com.taobao.android.litecreator.util.al;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class RPConfig {
    private static final String[] DEFAULT_BIZ_PERMISSION_WHITE_LIST = {com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.WRITE_CALENDAR", "android.permission.READ_MEDIA_AUDIO", al.READ_MEDIA_IMAGES, al.READ_MEDIA_VIDEO, al.READ_MEDIA_VISUAL_USER_SELECTED};
    public boolean enable = true;
    public List<String> sameScreenPopBizBlackList = null;
    public long sameScreenPopDelayTime = 400;
    public long sameScreenMarkDelayTime = 300;
    public long permissionReqSilenceInterval = 2592000;
    public List<String> callbackBizBlackList = new ArrayList();
    public List<String> bizPermissionWhiteList = Arrays.asList(DEFAULT_BIZ_PERMISSION_WHITE_LIST);
    public List<String> rollbackBizList = new ArrayList();
    public boolean enableUniformAuth = false;
}

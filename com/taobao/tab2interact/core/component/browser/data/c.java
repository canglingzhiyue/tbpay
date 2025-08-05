package com.taobao.tab2interact.core.component.browser.data;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import tb.ils;
import tb.kge;
import tb.oec;
import tb.oxt;
import tb.skq;
import tb.suq;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_OPTBALANCES = "optBalances";

    static {
        kge.a(1399811015);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null || !skq.g() || jSONObject.get("entranceList") == null) {
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("entranceList");
            if (jSONArray.size() <= 0 || jSONArray.get(0) == null) {
                return;
            }
            c(jSONArray.getJSONObject(0));
        }
    }

    private static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{jSONObject});
            return;
        }
        if (jSONObject.get(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM);
            if (jSONObject2.getJSONObject("textPic") == null) {
                String string = jSONObject2.getString("text");
                JSONObject f = skq.f();
                if (f != null && f.get(string) != null) {
                    JSONObject jSONObject3 = f.getJSONObject(string);
                    com.taobao.tab2interact.core.utils.a.b(null, "BrowserBadgeResponseDataProcessor", "预处理entrance，将底部区域文本转换为图片，pic=" + jSONObject3.toJSONString());
                    jSONObject2.put("pic", (Object) jSONObject3);
                }
            }
        }
        if (jSONObject.get("paddingComponent") == null) {
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("paddingComponent");
        long a2 = oec.a((Object) jSONObject4.getString("taskInitTime"), 0L);
        long a3 = oec.a((Object) jSONObject4.getString("duration"), 0L);
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.tab2interact.core.utils.a.b(null, "BrowserBadgeResponseDataProcessor", "预处理entrance，判断新人引导气泡的展示时间是否小于当前时间，taskInitTime=" + a2 + "，duration=" + a3 + "，currentTime=" + currentTimeMillis);
        if (a2 + (a3 * 1000) >= currentTimeMillis) {
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(null, "BrowserBadgeResponseDataProcessor", "预处理entrance，判断新人引导气泡的展示时间小于当前时间");
        jSONObject.remove("paddingComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel b(com.alibaba.fastjson.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.core.component.browser.data.c.b(com.alibaba.fastjson.JSONObject):com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel");
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel a(JSONObject jSONObject, BrowserBadgeModel.a aVar, BrowserBadgeModel.UserType userType, BrowserBadgeModel.UserStage userStage) {
        JSONObject jSONObject2;
        BrowserBadgeModel.BrowserBadgeViewModel.l lVar;
        BrowserBadgeModel.a.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel) ipChange.ipc$dispatch("220c90aa", new Object[]{jSONObject, aVar, userType, userStage});
        }
        if (jSONObject == null) {
            return null;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = new BrowserBadgeModel.BrowserBadgeViewModel();
        if (userStage != BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER && jSONObject.get("topComponent") != null) {
            BrowserBadgeModel.BrowserBadgeViewModel.g gVar = new BrowserBadgeModel.BrowserBadgeViewModel.g();
            JSONObject jSONObject3 = jSONObject.getJSONObject("topComponent");
            gVar.f19732a = a(jSONObject3, (BrowserBadgeModel.BrowserBadgeViewModel.f) null);
            if (jSONObject3.get("textPic") != null) {
                gVar.b = a(jSONObject3.getJSONObject("textPic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) null);
            }
            browserBadgeViewModel.f19725a = gVar;
        }
        if (userType == BrowserBadgeModel.UserType.REWARD_ENHANCED) {
            if (jSONObject.get("enhanceStyle") != null) {
                jSONObject2 = jSONObject.getJSONObject("enhanceStyle");
            }
            jSONObject2 = null;
        } else {
            if (jSONObject.get("middleComponent") != null) {
                jSONObject2 = jSONObject.getJSONObject("middleComponent");
            }
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            BrowserBadgeModel.BrowserBadgeViewModel.e eVar = new BrowserBadgeModel.BrowserBadgeViewModel.e();
            if (userType == BrowserBadgeModel.UserType.REWARD_ENHANCED) {
                String string = jSONObject2.getString("amount");
                String string2 = jSONObject2.getString("text");
                String string3 = jSONObject2.getString("textDesc");
                if (string != null) {
                    eVar.e = new BrowserBadgeModel.BrowserBadgeViewModel.f();
                    eVar.e.f19731a = string;
                    eVar.f = new BrowserBadgeModel.BrowserBadgeViewModel.f();
                    eVar.f.f19731a = "";
                } else if (string2 != null) {
                    eVar.e = new BrowserBadgeModel.BrowserBadgeViewModel.f();
                    eVar.e.f19731a = string2;
                    eVar.f = new BrowserBadgeModel.BrowserBadgeViewModel.f();
                    eVar.f.f19731a = string3;
                } else {
                    eVar.e = new BrowserBadgeModel.BrowserBadgeViewModel.f();
                    eVar.e.f19731a = null;
                    eVar.f = new BrowserBadgeModel.BrowserBadgeViewModel.f();
                    eVar.f.f19731a = null;
                }
            }
            eVar.g = new BrowserBadgeModel.BrowserBadgeViewModel.f();
            eVar.g.f19731a = jSONObject2.getString("topText");
            eVar.g.b = jSONObject2.getString("topTextColor");
            if (jSONObject2.get("bottomCountdown") != null) {
                eVar.h = a(jSONObject2.getJSONObject("bottomCountdown"), (BrowserBadgeModel.BrowserBadgeViewModel.j) null);
            }
            if (userStage == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                if (jSONObject2.get("freshCenterPic") != null) {
                    eVar.f19730a = a(jSONObject2.getJSONObject("freshCenterPic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) null);
                }
            } else if (jSONObject2.get("centerPic") != null) {
                eVar.f19730a = a(jSONObject2.getJSONObject("centerPic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) null);
            }
            if (jSONObject2.get("animate") != null) {
                eVar.b = a(jSONObject2.getJSONObject("animate"), (BrowserBadgeModel.BrowserBadgeViewModel.b) null);
            }
            if (jSONObject2.get(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR) != null) {
                eVar.c = a(jSONObject2.getJSONObject(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR), (BrowserBadgeModel.BrowserBadgeViewModel.d) null);
            }
            if (jSONObject.get("accountAnimate") != null) {
                eVar.d = a(jSONObject.getJSONObject("accountAnimate"), (BrowserBadgeModel.BrowserBadgeViewModel.a) null);
            }
            browserBadgeViewModel.b = eVar;
        }
        if (jSONObject.get(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM) != null && jSONObject.get("paddingComponent") == null) {
            BrowserBadgeModel.BrowserBadgeViewModel.c cVar = new BrowserBadgeModel.BrowserBadgeViewModel.c();
            JSONObject jSONObject4 = jSONObject.getJSONObject(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM);
            cVar.f19728a = a(jSONObject4, (BrowserBadgeModel.BrowserBadgeViewModel.f) null);
            if (jSONObject4.get("textRightPic") != null) {
                cVar.b = a(jSONObject4.getJSONObject("textRightPic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) null);
            }
            if (jSONObject4.get("backgroundPic") != null) {
                cVar.c = a(jSONObject4.getJSONObject("backgroundPic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) null);
            }
            if (jSONObject4.get("textPic") != null) {
                cVar.d = a(jSONObject4.getJSONObject("textPic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) null);
            } else if (jSONObject4.get("pic") != null) {
                cVar.d = a(jSONObject4.getJSONObject("pic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) null);
            }
            browserBadgeViewModel.c = cVar;
        }
        if (aVar == null || aVar.c == null) {
            lVar = null;
        } else {
            lVar = new BrowserBadgeModel.BrowserBadgeViewModel.l();
            if ("inProgress".equals(aVar.b)) {
                bVar = aVar.c.f19738a;
            } else {
                bVar = "finish".equals(aVar.b) ? aVar.c.b : null;
            }
            if (bVar == null) {
                lVar.f19734a = null;
                lVar.b = null;
            } else {
                lVar.f19734a = bVar.f19739a;
                lVar.b = bVar.b;
            }
        }
        browserBadgeViewModel.d = lVar;
        return browserBadgeViewModel;
    }

    private static BrowserBadgeModel.BrowserTaskModel a(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserTaskModel) ipChange.ipc$dispatch("c3f20abe", new Object[]{jSONObject, jSONObject2, jSONArray});
        }
        BrowserBadgeModel.BrowserTaskModel browserTaskModel = new BrowserBadgeModel.BrowserTaskModel();
        if (jSONObject != null && jSONObject.get("timerStatus") != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("timerStatus");
            browserTaskModel.f19735a = oec.a((Object) jSONObject3.getString("totalDuration"), 0L);
            browserTaskModel.b = oec.a((Object) jSONObject3.getString("currentDuration"), 0L);
            browserTaskModel.c = oec.a((Object) jSONObject3.getString(Constants.Name.INTERVAL), 0L);
        } else if (jSONObject2 != null) {
            browserTaskModel.f19735a = oec.a((Object) jSONObject2.getString("totalDuration"), 0L);
            browserTaskModel.b = oec.a((Object) jSONObject2.getString("currentDuration"), 0L);
            browserTaskModel.c = oec.a((Object) jSONObject2.getString(Constants.Name.INTERVAL), 0L);
        }
        if (jSONArray != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.size(); i++) {
                if (jSONArray.get(i) != null) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                    BrowserBadgeModel.BrowserTaskModel.ContentType b = b(jSONObject4.getString("contentType"));
                    BrowserBadgeModel.BrowserTaskModel.a aVar = new BrowserBadgeModel.BrowserTaskModel.a();
                    aVar.f19736a = oec.a((Object) jSONObject4.getString("singleTime"), 0L);
                    if (b != null) {
                        hashMap.put(b, aVar);
                    }
                }
            }
            browserTaskModel.d = hashMap;
        }
        return browserTaskModel;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.f a(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.f) ipChange.ipc$dispatch("f1fd03ca", new Object[]{jSONObject, fVar});
        }
        if (fVar == null) {
            fVar = new BrowserBadgeModel.BrowserBadgeViewModel.f();
        }
        if (jSONObject != null) {
            fVar.f19731a = jSONObject.getString("text");
            fVar.b = jSONObject.getString("textColor");
        }
        return fVar;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.PicModel a(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) ipChange.ipc$dispatch("4c6c0f0e", new Object[]{jSONObject, picModel});
        }
        if (picModel == null) {
            picModel = new BrowserBadgeModel.BrowserBadgeViewModel.PicModel();
        }
        if (jSONObject != null) {
            picModel.b = a(jSONObject.getString("type"), jSONObject.getString("url"));
            picModel.c = jSONObject.getString("url");
            picModel.d = jSONObject.getString("width");
            picModel.e = jSONObject.getString("height");
        }
        return picModel;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.b a(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.b) ipChange.ipc$dispatch("d53fd2d2", new Object[]{jSONObject, bVar});
        }
        if (bVar == null) {
            bVar = new BrowserBadgeModel.BrowserBadgeViewModel.b();
        }
        if (jSONObject != null && TextUtils.equals("ACCOUNT_AMOUNT_MULTIPLE", jSONObject.getString(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE))) {
            if (jSONObject.get("pic") != null) {
                a(jSONObject.getJSONObject("pic"), (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) bVar);
            }
            bVar.f19727a = oec.a((Object) jSONObject.getString("factorValue"), 0);
        }
        return bVar;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.d a(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.d) ipChange.ipc$dispatch("639e6b4e", new Object[]{jSONObject, dVar});
        }
        if (dVar == null) {
            dVar = new BrowserBadgeModel.BrowserBadgeViewModel.d();
        }
        if (jSONObject != null) {
            dVar.f19729a = jSONObject.getString("paddingColor");
            dVar.b = oec.a((Object) jSONObject.getString("totalProgressDuration"), 0L);
        }
        return dVar;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.a a(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.a) ipChange.ipc$dispatch("e108694", new Object[]{jSONObject, aVar});
        }
        if (aVar == null) {
            aVar = new BrowserBadgeModel.BrowserBadgeViewModel.a();
        }
        if (jSONObject != null) {
            aVar.f19726a = oec.a((Object) jSONObject.getString("startAmount"), 0);
            aVar.b = oec.a((Object) jSONObject.getString("endAmount"), 0);
            aVar.c = oec.a((Object) jSONObject.getString("millisecPerCent"), 0L);
            aVar.d = jSONObject.getString("rmbSymbol");
        }
        return aVar;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.i a(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.i) ipChange.ipc$dispatch("478ae884", new Object[]{jSONObject, iVar});
        }
        if (iVar == null) {
            iVar = new BrowserBadgeModel.BrowserBadgeViewModel.i();
        }
        if (jSONObject != null) {
            iVar.f19733a = oec.a((Object) jSONObject.getString("remainingDuration"), 0L);
            iVar.b = jSONObject.getString("color");
            if (TextUtils.equals("FETCH_VIEW", jSONObject.getString(oxt.KEY_DIMENSION))) {
                iVar.c = BrowserBadgeModel.TaskType.BROWSE_IN_TASK_PANEL;
            }
        }
        return iVar;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.j a(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.j) ipChange.ipc$dispatch("eba34c2", new Object[]{jSONObject, jVar});
        }
        if (jVar == null) {
            jVar = new BrowserBadgeModel.BrowserBadgeViewModel.j();
        }
        if (jSONObject != null) {
            a(jSONObject, (BrowserBadgeModel.BrowserBadgeViewModel.i) jVar);
            jVar.d = jSONObject.getString(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE);
        }
        return jVar;
    }

    private static BrowserBadgeModel.UserType c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.UserType) ipChange.ipc$dispatch("c53b71f1", new Object[]{str});
        }
        if (!TextUtils.equals("true", str)) {
            return null;
        }
        return BrowserBadgeModel.UserType.REWARD_ENHANCED;
    }

    private static BrowserBadgeModel.UserStage a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.UserStage) ipChange.ipc$dispatch("5963dacb", new Object[]{str});
        }
        if (!TextUtils.equals("fresh", str)) {
            return null;
        }
        return BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER;
    }

    private static BrowserBadgeModel.BrowserTaskModel.ContentType b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserTaskModel.ContentType) ipChange.ipc$dispatch("ce918ccc", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1741312354:
                if (str.equals("collection")) {
                    c = 4;
                    break;
                }
                break;
            case -1247876910:
                if (str.equals("gggame")) {
                    c = 3;
                    break;
                }
                break;
            case 100897:
                if (str.equals("ext")) {
                    c = 5;
                    break;
                }
                break;
            case 3322092:
                if (str.equals("live")) {
                    c = 1;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c = 0;
                    break;
                }
                break;
            case 1391462382:
                if (str.equals("picture_album")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return BrowserBadgeModel.BrowserTaskModel.ContentType.VIDEO;
        }
        if (c == 1) {
            return BrowserBadgeModel.BrowserTaskModel.ContentType.LIVE;
        }
        if (c == 2) {
            return BrowserBadgeModel.BrowserTaskModel.ContentType.PICTURE_ALBUM;
        }
        if (c == 3) {
            return BrowserBadgeModel.BrowserTaskModel.ContentType.GG_GAME;
        }
        if (c == 4) {
            return BrowserBadgeModel.BrowserTaskModel.ContentType.COLLECTION;
        }
        if (c == 5) {
            return BrowserBadgeModel.BrowserTaskModel.ContentType.EXT;
        }
        return null;
    }

    private static BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type a(String str, String str2) {
        String path;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type) ipChange.ipc$dispatch("aff80de4", new Object[]{str, str2});
        }
        if (str == null && str2 != null) {
            try {
                Uri parse = Uri.parse(str2);
                if (parse != null && (path = parse.getPath()) != null && (lastIndexOf = path.lastIndexOf(46)) >= 0) {
                    str = path.substring(lastIndexOf + 1);
                }
            } catch (Exception e) {
                com.taobao.tab2interact.core.utils.a.a(null, "BrowserBadgeResponseDataProcessor", "浏览挂角通过图片url解析类型异常", e);
            }
        }
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 79369:
                if (str.equals("PNG")) {
                    c = 1;
                    break;
                }
                break;
            case 111145:
                if (str.equals("png")) {
                    c = 0;
                    break;
                }
                break;
            case 2015784:
                if (str.equals("APNG")) {
                    c = 3;
                    break;
                }
                break;
            case 3000872:
                if (str.equals("apng")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
        }
        if (c != 2 && c != 3) {
            return null;
        }
        return BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.APNG;
    }

    public static boolean a(BrowserBadgeModel browserBadgeModel) {
        BrowserBadgeModel.BrowserTaskModel browserTaskModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f24d954", new Object[]{browserBadgeModel})).booleanValue();
        }
        if (browserBadgeModel == null) {
            com.taobao.tab2interact.core.utils.a.b(null, "BrowserBadgeResponseDataProcessor", "验证浏览挂角数据有效性，browserBadgeModel为空");
            return false;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = browserBadgeModel.e;
        if (browserBadgeViewModel == null || browserBadgeViewModel.b == null || browserBadgeViewModel.b.f19730a == null || TextUtils.isEmpty(browserBadgeViewModel.b.f19730a.c)) {
            com.taobao.tab2interact.core.utils.a.b(null, "BrowserBadgeResponseDataProcessor", "验证浏览挂角数据有效性，browserBadgeViewModel.mMiddleAreaModel.mCenterPicModel.mUrl获取不到或为空");
            return false;
        } else if (browserBadgeModel.c || ((browserTaskModel = browserBadgeModel.d) != null && browserTaskModel.f19735a > 0 && browserTaskModel.b >= 0)) {
            return true;
        } else {
            com.taobao.tab2interact.core.utils.a.b(null, "BrowserBadgeResponseDataProcessor", "验证浏览挂角数据有效性，browserTaskModel不满足条件");
            return false;
        }
    }

    public static void b(BrowserBadgeModel browserBadgeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13c06af", new Object[]{browserBadgeModel});
        } else if (browserBadgeModel == null) {
        } else {
            if (browserBadgeModel.f == null) {
                browserBadgeModel.f = BrowserBadgeModel.UserType.DEFAULT;
            }
            if (browserBadgeModel.f19724a == null) {
                browserBadgeModel.f19724a = BrowserBadgeModel.UserStage.DEFAULT;
            }
            BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = browserBadgeModel.e;
            if (browserBadgeViewModel != null) {
                BrowserBadgeModel.BrowserBadgeViewModel.g gVar = browserBadgeViewModel.f19725a;
                if (gVar != null) {
                    BrowserBadgeModel.BrowserBadgeViewModel.f fVar = gVar.f19732a;
                    if (fVar != null && !TextUtils.isEmpty(fVar.f19731a) && TextUtils.isEmpty(fVar.b)) {
                        fVar.b = "#f9b20a";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel = gVar.b;
                    if (picModel != null && !TextUtils.isEmpty(picModel.c)) {
                        if (picModel.b == null) {
                            picModel.b = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel.d)) {
                            picModel.d = ils.ARCH_BIT32;
                        }
                        if (TextUtils.isEmpty(picModel.e)) {
                            picModel.e = ils.ARCH_BIT32;
                        }
                    }
                }
                BrowserBadgeModel.BrowserBadgeViewModel.c cVar = browserBadgeViewModel.c;
                if (cVar != null) {
                    BrowserBadgeModel.BrowserBadgeViewModel.f fVar2 = cVar.f19728a;
                    if (fVar2 != null && !TextUtils.isEmpty(fVar2.f19731a) && TextUtils.isEmpty(fVar2.b)) {
                        fVar2.b = "#f9ef9f";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel2 = cVar.b;
                    if (picModel2 != null && !TextUtils.isEmpty(picModel2.c)) {
                        if (picModel2.b == null) {
                            picModel2.b = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel2.d)) {
                            picModel2.d = "9";
                        }
                        if (TextUtils.isEmpty(picModel2.e)) {
                            picModel2.e = AgooConstants.ACK_PACK_NOBIND;
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel3 = cVar.c;
                    if (picModel3 != null && !TextUtils.isEmpty(picModel3.c)) {
                        if (picModel3.b == null) {
                            picModel3.b = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel3.d)) {
                            picModel3.d = "85";
                        }
                        if (TextUtils.isEmpty(picModel3.e)) {
                            picModel3.e = "34";
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel4 = cVar.d;
                    if (picModel4 != null && !TextUtils.isEmpty(picModel4.c)) {
                        if (picModel4.b == null) {
                            picModel4.b = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel4.d)) {
                            picModel4.d = "86";
                        }
                        if (TextUtils.isEmpty(picModel4.e)) {
                            picModel4.e = "34";
                        }
                    }
                }
                BrowserBadgeModel.BrowserBadgeViewModel.e eVar = browserBadgeViewModel.b;
                if (eVar != null) {
                    BrowserBadgeModel.BrowserBadgeViewModel.f fVar3 = eVar.e;
                    if (fVar3 != null && !TextUtils.isEmpty(fVar3.f19731a) && TextUtils.isEmpty(fVar3.b)) {
                        fVar3.b = "#ff0000";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.f fVar4 = eVar.f;
                    if (fVar4 != null && !TextUtils.isEmpty(fVar4.f19731a) && TextUtils.isEmpty(fVar4.b)) {
                        fVar4.b = "#ff0000";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.f fVar5 = eVar.g;
                    if (fVar5 != null && !TextUtils.isEmpty(fVar5.f19731a) && TextUtils.isEmpty(fVar5.b)) {
                        fVar5.b = "#FFD666";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.j jVar = eVar.h;
                    if (jVar != null) {
                        if (TextUtils.isEmpty(jVar.b)) {
                            jVar.b = "#FFD666";
                        }
                        if (jVar.c == null) {
                            jVar.c = BrowserBadgeModel.TaskType.DEFAULT;
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel5 = eVar.f19730a;
                    if (picModel5 != null && !TextUtils.isEmpty(picModel5.c)) {
                        if (picModel5.b == null) {
                            picModel5.b = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel5.d)) {
                            picModel5.d = "90";
                        }
                        if (TextUtils.isEmpty(picModel5.e)) {
                            picModel5.e = "90";
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.d dVar = eVar.c;
                    if (dVar == null) {
                        dVar = new BrowserBadgeModel.BrowserBadgeViewModel.d();
                    }
                    if (TextUtils.isEmpty(dVar.f19729a)) {
                        dVar.f19729a = "#ffb600";
                    }
                }
            }
            BrowserBadgeModel.BrowserTaskModel browserTaskModel = browserBadgeModel.d;
            if (browserTaskModel == null || browserTaskModel.c > 0) {
                return;
            }
            browserTaskModel.c = 5000L;
        }
    }
}

package com.taobao.tbliveinteractive.jsbridge;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXUtils;
import com.uc.webview.export.media.CommandID;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.fxb;
import tb.kge;
import tb.nmf;
import tb.pmd;
import tb.pqj;
import tb.qnb;
import tb.qne;
import tb.qnh;
import tb.riy;
import tb.tfu;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static e h;
    private static String i;

    /* renamed from: a  reason: collision with root package name */
    private String f22135a;
    private Context b;
    private com.taobao.alilive.aliliveframework.frame.a c;
    private c e;
    private a f;
    private com.taobao.tbliveinteractive.e g;
    private boolean j = false;
    private b d = new f();

    static {
        kge.a(-1523713299);
    }

    public static /* synthetic */ b a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3e734c29", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ com.taobao.tbliveinteractive.e b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.e) ipChange.ipc$dispatch("14f866a4", new Object[]{eVar}) : eVar.g;
    }

    public static /* synthetic */ c c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c9b5d186", new Object[]{eVar}) : eVar.e;
    }

    public e() {
    }

    public e(String str, Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f22135a = str;
        this.b = context;
        this.c = aVar;
    }

    public void a(com.taobao.tbliveinteractive.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e27dec", new Object[]{this, eVar});
        } else {
            this.g = eVar;
        }
    }

    public com.taobao.tbliveinteractive.e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.e) ipChange.ipc$dispatch("5ef56032", new Object[]{this}) : this.g;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7475d9", new Object[]{this, cVar});
        } else {
            this.e = cVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c738d1b", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.j;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = true;
        this.b = null;
        this.g = null;
        c cVar = this.e;
        if (cVar != null) {
            cVar.a();
            this.e = null;
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.a();
            this.f = null;
        }
        this.d = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean a(IWVWebView iWVWebView, String str, final HashMap<String, String> hashMap, String str2, final com.taobao.tbliveinteractive.container.h5.e eVar) {
        char c;
        boolean d;
        Dialog dialog;
        View findViewById;
        JSONObject b;
        JSONObject b2;
        Boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d835cd3", new Object[]{this, iWVWebView, str, hashMap, str2, eVar})).booleanValue();
        }
        if (!a(str, hashMap)) {
            eVar.b("{\"result\":\"token_error\"}");
            return false;
        }
        switch (str.hashCode()) {
            case -2132385364:
                if (str.equals("subscribePowerMessage")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -2055881130:
                if (str.equals("setWebViewFrame")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -2019399943:
                if (str.equals("gotoShop")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -1949694211:
                if (str.equals("interactiveDisappearFloatingLayerWithParam")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1895231843:
                if (str.equals("getLiveDetailData")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1888549732:
                if (str.equals("glTimeOut")) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -1757019252:
                if (str.equals(CommandID.getCurrentPosition)) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case -1672040206:
                if (str.equals("interactClick")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1581789895:
                if (str.equals("startVideo")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1567888527:
                if (str.equals("interactUpdateEntranceAnimateView")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1554319851:
                if (str.equals("shouldDisplayH5NewUserPanel")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1545016173:
                if (str.equals("unSubscribePowerMessage")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -1387355562:
                if (str.equals("refreshRoom")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1352812510:
                if (str.equals("openWebViewLayer")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -1323274079:
                if (str.equals("destroyVideo")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -1268958287:
                if (str.equals("follow")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1259466211:
                if (str.equals("addFavor")) {
                    c = riy.CONDITION_IF;
                    break;
                }
                c = 65535;
                break;
            case -1221253851:
                if (str.equals("interactiveInstalledComponent")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1208183396:
                if (str.equals("interactiveInitComponentWithParam")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1190667147:
                if (str.equals("getWatermarkHeight")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -1149096095:
                if (str.equals(tfu.ADD_CART)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1005817941:
                if (str.equals("getLiveRoomInfo")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -953908283:
                if (str.equals("getVirtualBarHeight")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -931438650:
                if (str.equals("componentOpened")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -906224877:
                if (str.equals(CommandID.seekTo)) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -890782950:
                if (str.equals("hideWebViewLayer")) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -888399867:
                if (str.equals("invokeEditor")) {
                    c = riy.CONDITION_IF_MIDDLE;
                    break;
                }
                c = 65535;
                break;
            case -873402250:
                if (str.equals("getUserLoginInfo")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -821289114:
                if (str.equals("updateFavorImage")) {
                    c = com.taobao.tao.image.d.LEVEL_I;
                    break;
                }
                c = 65535;
                break;
            case -700983661:
                if (str.equals("isHideTLiveBrand")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -637314352:
                if (str.equals("closeWebViewLayer")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -594924165:
                if (str.equals(nmf.MTOP_ISFOLLOW)) {
                    c = fxb.DIR;
                    break;
                }
                c = 65535;
                break;
            case -538325091:
                if (str.equals("componentAllLoadFinish")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -482535693:
                if (str.equals("closeRoom")) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -412219496:
                if (str.equals("enableNativeRightEntrance")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -347344337:
                if (str.equals("switchRoom")) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case -263964524:
                if (str.equals("enableUpDownSwitch")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -242839163:
                if (str.equals("closeEditor")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -208290750:
                if (str.equals("showSharePanel")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -158866411:
                if (str.equals("interactiveRenderFinishComponentWithParam")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -87658418:
                if (str.equals("resumeVideo")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -83557505:
                if (str.equals("getFEResourceCache")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -55818203:
                if (str.equals("pauseVideo")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -35662056:
                if (str.equals("getActivityBizData")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -26619798:
                if (str.equals("subscribePowerMessageList")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 78326644:
                if (str.equals("queryWebViewNewLayerStatus")) {
                    c = com.taobao.tao.image.d.LEVEL_E;
                    break;
                }
                c = 65535;
                break;
            case 144482679:
                if (str.equals("feResourceDownloadSucc")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 151192493:
                if (str.equals("showGoodsPackage")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 242587193:
                if (str.equals("getAppInfo")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 246560048:
                if (str.equals("setFansLevelInfo")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 249802644:
                if (str.equals(tfu.GOTO_DETAIL)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 396819118:
                if (str.equals("containerScroll")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 450611280:
                if (str.equals("enableNativeEntrance")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 454994470:
                if (str.equals("hideWidget")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 588396421:
                if (str.equals("getComponentList")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 700587808:
                if (str.equals("openWebViewNewLayer")) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 743769786:
                if (str.equals("interactUpdateEntranceView")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 753037975:
                if (str.equals("showGoodsList")) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case 872597773:
                if (str.equals("getEntryOriginUrl")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 887041953:
                if (str.equals("showWidget")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 903378751:
                if (str.equals("goToCommonDetail")) {
                    c = JSONLexer.EOI;
                    break;
                }
                c = 65535;
                break;
            case 949719731:
                if (str.equals("interactiveAppearFloatingLayerWithParam")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 958241142:
                if (str.equals("openCommentInputBox")) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 972063840:
                if (str.equals("containerStateChange")) {
                    c = com.taobao.tao.image.d.LEVEL_D;
                    break;
                }
                c = 65535;
                break;
            case 1149883639:
                if (str.equals("requestMtop")) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case 1151744482:
                if (str.equals("muteVideo")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1276470076:
                if (str.equals("rectInfoOfNativeElement")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1290758630:
                if (str.equals("enableLeftRightSwitch")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1313241378:
                if (str.equals("enable3DFeature")) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case 1332009555:
                if (str.equals("interactShow")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1536672141:
                if (str.equals("renderSuccess")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1600645015:
                if (str.equals("updateIntimacyData")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1602463842:
                if (str.equals("closeGoodsListWeexView")) {
                    c = com.taobao.tao.image.d.LEVEL_L;
                    break;
                }
                c = 65535;
                break;
            case 1762051898:
                if (str.equals("hasH5Container")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1784500952:
                if (str.equals("setPenetrateAlpha")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1858783894:
                if (str.equals("getLiveHalfWebviewStatus")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 1864364162:
                if (str.equals("getTimeMoveInfo")) {
                    c = WXUtils.PERCENT;
                    break;
                }
                c = 65535;
                break;
            case 1898246239:
                if (str.equals("is3DFeatureInstalled")) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case 1976471505:
                if (str.equals("unSubscribePowerMessageList")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1979010522:
                if (str.equals("postEvent")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case 2083326353:
                if (str.equals("navToURL")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2098860747:
                if (str.equals("cancelFollow")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enable", (Object) true);
                eVar.a(jSONObject.toJSONString());
                return true;
            case 1:
            case 2:
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) true);
                eVar.a(jSONObject2.toJSONString());
                return true;
            case 3:
                if (!hashMap.isEmpty()) {
                    this.d.a(this.g, hashMap);
                }
                return true;
            case 4:
                a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        HashMap hashMap2 = hashMap;
                        if (hashMap2 == null || hashMap2.isEmpty() || e.a(e.this) == null) {
                            return;
                        }
                        e.a(e.this).a(e.b(e.this), (Map<String, String>) hashMap);
                    }
                });
                return true;
            case 5:
                if (hashMap.isEmpty()) {
                    return false;
                }
                this.d.a(new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                        } else {
                            eVar.a(str3);
                        }
                    }

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            eVar.b();
                        }
                    }
                }, this.b, hashMap.get("feResUrl"), hashMap.get("data"));
                return true;
            case 6:
                if (hashMap.isEmpty()) {
                    return false;
                }
                this.d.a(new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                        } else {
                            eVar.a(str3);
                        }
                    }

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            eVar.b();
                        }
                    }
                }, this.b, hashMap.get("feResUrl"));
                return true;
            case 7:
                this.d.a(new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                            return;
                        }
                        eVar.a(str3);
                        qnh.a("getComponentList_callBack", "errorCode=success");
                    }

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void b(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str3});
                            return;
                        }
                        eVar.b(str3);
                        qnh.a("getComponentList_CallBack", "errorCode=error");
                    }
                }, this.g);
                qnh.a("getComponentList_callBack", "errorCode=call");
                return true;
            case '\b':
                if (hashMap.isEmpty()) {
                    return false;
                }
                this.d.b(this.g, hashMap);
                return true;
            case '\t':
                if (!hashMap.isEmpty()) {
                    eVar.a(this.d.c(this.g, hashMap));
                    return true;
                }
                eVar.b();
                return false;
            case '\n':
                this.d.a(this.g);
                eVar.a();
                return true;
            case 11:
                if (hashMap.isEmpty()) {
                    return false;
                }
                this.d.d(this.g, hashMap);
                return true;
            case '\f':
                if (hashMap.isEmpty()) {
                    return false;
                }
                this.d.e(this.g, hashMap);
                return true;
            case '\r':
                if (hashMap.isEmpty()) {
                    return false;
                }
                this.d.f(this.g, hashMap);
                return true;
            case 14:
                a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            com.taobao.taolive.sdk.utils.h.a().a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.10.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (hashMap == null || hashMap.isEmpty() || e.a(e.this) == null) {
                                    } else {
                                        e.a(e.this).g(e.b(e.this), hashMap);
                                    }
                                }
                            });
                        }
                    }
                });
                return true;
            case 15:
                a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            com.taobao.taolive.sdk.utils.h.a().a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.11.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (hashMap == null || hashMap.isEmpty() || e.a(e.this) == null) {
                                    } else {
                                        e.a(e.this).h(e.b(e.this), hashMap);
                                    }
                                }
                            });
                        }
                    }
                });
                return true;
            case 16:
                this.d.a(this.f22135a, str2);
                eVar.a("true");
                return true;
            case 17:
                if (!hashMap.isEmpty()) {
                    String str3 = hashMap.get("name");
                    String str4 = hashMap.get("version");
                    if (this.d.a(new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.12
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tbliveinteractive.jsbridge.g
                        public void a(String str5) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                            } else {
                                eVar.a(str5);
                            }
                        }

                        @Override // com.taobao.tbliveinteractive.jsbridge.g
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                eVar.b();
                            }
                        }
                    }, this.g, str3, str4)) {
                        return true;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", str3);
                    hashMap2.put("version", str4);
                    hashMap2.put("errorType", "installedComponent false");
                    eVar.a(pqj.a(hashMap2));
                    return true;
                }
                eVar.b();
                return false;
            case 18:
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("result", (Object) Integer.valueOf(this.d.a(this.b)));
                eVar.a(jSONObject3.toJSONString());
                return true;
            case 19:
                if (!hashMap.isEmpty()) {
                    eVar.a(this.d.a(this.g, this.b, hashMap.get("nativeElement")).toJSONString());
                    return true;
                }
                eVar.b();
                return false;
            case 20:
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", (Object) false);
                jSONObject4.put("isSupportHuanduanParam", (Object) true);
                jSONObject4.put("isSupport0yg", (Object) true);
                jSONObject4.put("isNeedShowH5", (Object) Boolean.valueOf(!qne.b(this.g.j(), this.g.k())));
                eVar.a(jSONObject4.toJSONString());
                return true;
            case 21:
                this.e.a(iWVWebView);
                eVar.a();
                return true;
            case 22:
                return this.e.a(this.g, iWVWebView, hashMap, new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a(String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                        } else {
                            eVar.a(str5);
                        }
                    }

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            eVar.b();
                        }
                    }
                });
            case 23:
                String b3 = this.e.b();
                if (!TextUtils.isEmpty(b3)) {
                    eVar.a(b3);
                    return true;
                }
                eVar.b();
                return false;
            case 24:
                if (this.e.b(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 25:
                if (this.e.i(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 26:
            case 27:
                if (this.e.j(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 28:
                if (this.e.k(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 29:
            case 30:
            case 31:
            case ' ':
                if ("startVideo".equals(str)) {
                    d = this.e.c(hashMap);
                } else if ("pauseVideo".equals(str)) {
                    d = this.e.c();
                } else if ("resumeVideo".equals(str)) {
                    d = this.e.d();
                } else {
                    d = "muteVideo".equals(str) ? this.e.d(hashMap) : false;
                }
                if (d) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '!':
                if (this.e.a(this.g, hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '\"':
                if (this.e.b(this.g, hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                break;
            case '#':
                break;
            case '$':
                if (this.e != null && this.b != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("entryOriginUrl", (Object) this.e.k());
                    eVar.a(jSONObject5.toString());
                    return true;
                }
                eVar.b();
                return false;
            case '%':
                eVar.a(this.e.i());
                return true;
            case '&':
                final org.json.JSONObject a3 = this.e.a(this.b);
                a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        org.json.JSONObject jSONObject6 = a3;
                        if (jSONObject6 == null) {
                            eVar.b();
                            return;
                        }
                        String jSONObject7 = jSONObject6.toString();
                        if (!TextUtils.isEmpty(jSONObject7)) {
                            eVar.a(jSONObject7);
                        } else {
                            eVar.b();
                        }
                    }
                });
                return true;
            case '\'':
                a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (e.c(e.this) == null) {
                            eVar.b();
                        } else {
                            String f = e.c(e.this).f();
                            if (!TextUtils.isEmpty(f)) {
                                eVar.a(f);
                            } else {
                                eVar.b();
                            }
                        }
                    }
                });
                return true;
            case '(':
                eVar.a(this.e.l());
                return true;
            case ')':
                this.e.a(new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a(String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                        } else {
                            eVar.a(str5);
                        }
                    }

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            eVar.b();
                        }
                    }
                });
                return true;
            case '*':
                if (this.e.h(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '+':
                this.e.r(hashMap);
                eVar.a();
                return true;
            case ',':
                if (hashMap == null) {
                    return false;
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(TBWXConfigManger.WX_SUPPORT_KEY, (Object) Boolean.toString(this.e.j()));
                eVar.a(jSONObject6.toString());
                return true;
            case '-':
                if (this.e.l(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '.':
                if (this.e.m(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '/':
                this.e.a(new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a(String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                        } else {
                            eVar.a(str5);
                        }
                    }

                    @Override // com.taobao.tbliveinteractive.jsbridge.g
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            eVar.b();
                        }
                    }
                }, hashMap);
                return true;
            case '0':
                if (this.e.a(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '1':
                a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            com.taobao.taolive.sdk.utils.h.a().a(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.e.5.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (e.c(e.this) == null || hashMap == null || hashMap.isEmpty()) {
                                        eVar.b();
                                    } else {
                                        e.a(e.this).a(e.b(e.this), l.a((String) hashMap.get("msgType")));
                                        eVar.a();
                                    }
                                }
                            });
                        }
                    }
                });
                return true;
            case '2':
                if (this.e != null && hashMap != null && !hashMap.isEmpty()) {
                    String str5 = hashMap.get("msgTypeList");
                    if (!TextUtils.isEmpty(str5)) {
                        this.d.a(this.g, str5.split(","));
                        eVar.a();
                        return true;
                    }
                }
                eVar.b();
                return false;
            case '3':
                if (!hashMap.isEmpty()) {
                    this.d.b(this.g, l.a(hashMap.get("msgType")));
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '4':
                if (!hashMap.isEmpty()) {
                    String str6 = hashMap.get("msgTypeList");
                    if (!TextUtils.isEmpty(str6)) {
                        this.d.b(this.g, str6.split(","));
                        eVar.a();
                        return true;
                    }
                }
                eVar.b();
                return false;
            case '5':
                if (!this.e.e(hashMap)) {
                    return false;
                }
                eVar.a();
                return true;
            case '6':
                if (!this.e.f(hashMap)) {
                    return false;
                }
                eVar.a();
                return true;
            case '7':
                if (this.e.p(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '8':
                if (this.e.q(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '9':
                if (this.e.n(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case ':':
                if (this.e.g(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case ';':
                if (this.e.e()) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return true;
            case '<':
                if (this.e.g()) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '=':
                long m = this.e.m();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("position", (Object) Long.valueOf(m));
                eVar.a(jSONObject7.toJSONString());
                return true;
            case '>':
                if (this.e.o(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '?':
                if (this.e.h()) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case '@':
                com.taobao.tbliveinteractive.e eVar2 = this.g;
                if (eVar2 != null) {
                    eVar2.c("other");
                }
                if (this.e.a(this.g, iWVWebView)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'A':
                if (this.e.a(this.g, iWVWebView, hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'B':
                if (a().q() instanceof FragmentActivity) {
                    Fragment findFragmentByTag = ((FragmentActivity) a().q()).getSupportFragmentManager().findFragmentByTag(TaoLiveWebBottomFragment.tag());
                    if (!(findFragmentByTag instanceof TaoLiveWebBottomFragment) || (dialog = ((TaoLiveWebBottomFragment) findFragmentByTag).getDialog()) == null || (findViewById = dialog.findViewById(R.id.web)) == null) {
                        return true;
                    }
                    r rVar = new r();
                    if (findViewById.getTag(R.id.tag_support_scroll_up) instanceof Boolean) {
                        rVar.a("supportUpScrollPage", findViewById.getTag(R.id.tag_support_scroll_up));
                    } else {
                        rVar.a("supportScrollPage", (Object) false);
                    }
                    eVar.a(rVar);
                    return true;
                }
                eVar.b("半屏容器没有上屏");
                return true;
            case 'C':
                if (a().q() instanceof FragmentActivity) {
                    Fragment findFragmentByTag2 = ((FragmentActivity) a().q()).getSupportFragmentManager().findFragmentByTag(TaoLiveWebBottomFragment.tag());
                    if (!(findFragmentByTag2 instanceof TaoLiveWebBottomFragment)) {
                        return true;
                    }
                    TaoLiveWebBottomFragment taoLiveWebBottomFragment = (TaoLiveWebBottomFragment) findFragmentByTag2;
                    if (taoLiveWebBottomFragment != null && !TextUtils.isEmpty(str2) && (b = pqj.b(str2)) != null) {
                        taoLiveWebBottomFragment.setContainerNeedScroll(b.getBooleanValue("containerNeedScroll"));
                    }
                    eVar.a();
                    return true;
                }
                eVar.b("半屏容器没有上屏");
                return true;
            case 'D':
                if (a().q() instanceof FragmentActivity) {
                    Fragment findFragmentByTag3 = ((FragmentActivity) a().q()).getSupportFragmentManager().findFragmentByTag(TaoLiveWebBottomFragment.tag());
                    if (!(findFragmentByTag3 instanceof TaoLiveWebBottomFragment)) {
                        return true;
                    }
                    TaoLiveWebBottomFragment taoLiveWebBottomFragment2 = (TaoLiveWebBottomFragment) findFragmentByTag3;
                    if (taoLiveWebBottomFragment2 != null && !TextUtils.isEmpty(str2) && (b2 = pqj.b(str2)) != null) {
                        taoLiveWebBottomFragment2.setContainerExpand(b2.getBooleanValue(AbsListWidgetInstance.KEY_SECTION_EXPAND));
                    }
                    eVar.a();
                    return true;
                }
                eVar.b("半屏容器没有上屏");
                return true;
            case 'E':
                if (a().q() instanceof FragmentActivity) {
                    Fragment findFragmentByTag4 = ((FragmentActivity) a().q()).getSupportFragmentManager().findFragmentByTag(TaoLiveWebBottomFragment.tag());
                    if (!(findFragmentByTag4 instanceof TaoLiveWebBottomFragment)) {
                        return true;
                    }
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("status", (Object) ((TaoLiveWebBottomFragment) findFragmentByTag4).getContainerExpandState());
                    eVar.a(jSONObject8.toJSONString());
                    return true;
                }
                eVar.b("半屏容器没有上屏");
                return true;
            case 'F':
                if (!TextUtils.isEmpty(str2) && this.e.a(this.g, iWVWebView, pqj.b(str2))) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'G':
                if (this.e.b(this.g, iWVWebView)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'H':
                if (this.e.s(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'I':
                if (this.e.t(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return true;
            case 'J':
                Map<String, Object> b4 = qnb.b(str2);
                if (b4 != null) {
                    this.e.b(new g() { // from class: com.taobao.tbliveinteractive.jsbridge.e.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tbliveinteractive.jsbridge.g
                        public void a(String str7) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str7});
                            } else {
                                eVar.a(str7);
                            }
                        }

                        @Override // com.taobao.tbliveinteractive.jsbridge.g
                        public void b(String str7) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str7});
                            } else {
                                eVar.b(str7);
                            }
                        }
                    }, b4);
                    return true;
                }
                eVar.b();
                return false;
            case 'K':
                if (this.e.u(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'L':
                if (this.e.o()) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'M':
                if (this.e.v(hashMap)) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'N':
                if (this.e.p()) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            case 'O':
                org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                try {
                    jSONObject9.put("result", "false");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                eVar.a(jSONObject9.toString());
                return true;
            case 'P':
                org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                if (pmd.a().v() != null) {
                    try {
                        jSONObject10.put("result", "false");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                eVar.a(jSONObject10.toString());
                return true;
            case 'Q':
                if (this.e.n()) {
                    eVar.a();
                    return true;
                }
                eVar.b();
                return false;
            default:
                a aVar = this.f;
                if (aVar != null && (a2 = aVar.a(iWVWebView, str, str2, eVar)) != null) {
                    return a2.booleanValue();
                }
                eVar.b("{\"result\":\"no_function\"}");
                return false;
        }
        Context context = this.b;
        if (context != null && (context instanceof Activity)) {
            Intent intent = ((Activity) context).getIntent();
            if (intent == null) {
                eVar.b();
                return true;
            }
            Uri data = intent.getData();
            if (data == null) {
                eVar.b();
                return true;
            }
            c cVar = this.e;
            if (cVar != null) {
                Map a4 = cVar.a(data);
                if (a4 != null) {
                    eVar.a(pqj.a(a4));
                    return true;
                }
                eVar.a();
                return true;
            }
            eVar.b();
            return true;
        }
        eVar.b();
        return true;
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (qne.a(this.b)) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    AsyncTask.execute(runnable);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
            runnable.run();
        }
    }

    private boolean a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3202a445", new Object[]{this, str, hashMap})).booleanValue();
        }
        if (qne.d(str)) {
            boolean z = hashMap != null && hashMap.containsKey("token") && TextUtils.equals(hashMap.get("token"), qne.M());
            if (qne.t() && !z) {
                return false;
            }
        }
        return true;
    }

    public static void a(String str, e eVar) {
        e eVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17e4a0d", new Object[]{str, eVar});
            return;
        }
        if (!TextUtils.equals(i, str) && (eVar2 = h) != null) {
            eVar2.b();
        }
        i = str;
        h = eVar;
    }

    public static e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("da9dfa59", new Object[0]) : h;
    }

    public static void a(String str) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!TextUtils.equals(i, str) || (eVar = h) == null) {
        } else {
            eVar.b();
            h = null;
        }
    }
}

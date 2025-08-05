package com.taobao.android.detail.ttdetail.feature;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.o;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    private static final boolean f10641a;
    public static final Map<String, Boolean> mFeature;
    public static final String sAbilityNotFoundHandlerToast = "handlerNotFound";
    public static final String sBottomInBottomOut = "bottomInBottomOut";
    public static final String sCallbackInOnCreate = "callbackOnCreateMainThread";
    public static final String sClipLowDevicePreloadData = "clipLowDevicePreloadData";
    public static final String sClipStreamingData = "clipStreamingData";
    public static final String sCropMtopData = "cropMtopData";
    public static final String sDisableStreamingNetwork = "disableStreamingMtop";
    public static final String sDowngradeDetail2 = "downgradeDetail2";
    public static final String sDowngradeIndustry = "downgradeIndustry";
    public static final String sEnableCompatibleSmallWindow = "compatibleSmallWindow";
    public static final String sEnableNewUserBehavior = "enableNewUserBehavior";
    public static final String sForceConvertIndustryHeader = "forceConvertIndustryHeader";
    public static final String sForceConvertUltron = "forceConvertUltron";
    public static final String sForceNewArchitecture = "forceNewArchitecture";
    public static final String sHeaderFlingMode = "headerFlingMode";
    public static final String sInsideWithStdPopAnim = "insideWithStdPopAnim";
    public static final String sInvokePreloadRender = "invokePreloadRender";
    public static final String sInvokeStreamingFinish = "invokeStreamingFinish";
    public static final String sMockTBLiveTinyShop = "mockTBLiveTinyShop";
    public static final String sRequestWithDebugMode = "requestWithDebugMode";
    public static final String sShowDxRenderCost = "dxCreateRenderCost";
    public static final String sShowPerformancePanel = "showPerformancePanel";
    public static final String sTryRequestDetail2 = "requestDetail2";
    public static final String sTryRequestIndustry = "requestIndustry";

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f10641a;
    }

    static {
        kge.a(-2095097011);
        f10641a = o.a(f.a());
        mFeature = new HashMap<String, Boolean>() { // from class: com.taobao.android.detail.ttdetail.feature.DevFeature$1
            {
                put(a.sShowDxRenderCost, false);
                put(a.sAbilityNotFoundHandlerToast, Boolean.valueOf(a.a()));
                put(a.sRequestWithDebugMode, Boolean.valueOf(a.a()));
                put(a.sHeaderFlingMode, null);
                put(a.sForceNewArchitecture, Boolean.valueOf(a.a()));
                put(a.sCallbackInOnCreate, false);
                put(a.sInvokePreloadRender, true);
                put(a.sInvokeStreamingFinish, false);
                put(a.sClipStreamingData, false);
                put(a.sShowPerformancePanel, false);
                put(a.sClipLowDevicePreloadData, true);
                put(a.sTryRequestIndustry, false);
                put(a.sDowngradeIndustry, false);
                put(a.sTryRequestDetail2, false);
                put(a.sInsideWithStdPopAnim, false);
                put(a.sBottomInBottomOut, false);
                put(a.sForceConvertIndustryHeader, false);
                put(a.sCropMtopData, false);
                put(a.sEnableCompatibleSmallWindow, false);
                put(a.sDisableStreamingNetwork, false);
                put(a.sEnableNewUserBehavior, Boolean.valueOf(a.a()));
                put(a.sMockTBLiveTinyShop, false);
                put(a.sForceConvertUltron, false);
            }
        };
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        final String[] strArr = {sShowDxRenderCost, sAbilityNotFoundHandlerToast, sRequestWithDebugMode, sHeaderFlingMode, sForceNewArchitecture, sCallbackInOnCreate, sInvokePreloadRender, sInvokeStreamingFinish, sClipStreamingData, sShowPerformancePanel, sClipLowDevicePreloadData, sTryRequestIndustry, sDowngradeIndustry, sTryRequestDetail2, sInsideWithStdPopAnim, sBottomInBottomOut, sForceConvertIndustryHeader, sCropMtopData, sEnableCompatibleSmallWindow, sDisableStreamingNetwork, sEnableNewUserBehavior, sMockTBLiveTinyShop, sForceConvertUltron};
        new AlertDialog.Builder(context).setTitle("DFeature").setMultiChoiceItems(strArr, new boolean[]{Boolean.TRUE.equals(mFeature.get(sShowDxRenderCost)), Boolean.TRUE.equals(mFeature.get(sAbilityNotFoundHandlerToast)), Boolean.TRUE.equals(mFeature.get(sRequestWithDebugMode)), Boolean.TRUE.equals(mFeature.get(sHeaderFlingMode)), Boolean.TRUE.equals(mFeature.get(sForceNewArchitecture)), Boolean.TRUE.equals(mFeature.get(sCallbackInOnCreate)), Boolean.TRUE.equals(mFeature.get(sInvokePreloadRender)), Boolean.TRUE.equals(mFeature.get(sInvokeStreamingFinish)), Boolean.TRUE.equals(mFeature.get(sClipStreamingData)), Boolean.TRUE.equals(mFeature.get(sShowPerformancePanel)), Boolean.TRUE.equals(mFeature.get(sClipLowDevicePreloadData)), Boolean.TRUE.equals(mFeature.get(sTryRequestIndustry)), Boolean.TRUE.equals(mFeature.get(sDowngradeIndustry)), Boolean.TRUE.equals(mFeature.get(sTryRequestDetail2)), Boolean.TRUE.equals(mFeature.get(sInsideWithStdPopAnim)), Boolean.TRUE.equals(mFeature.get(sBottomInBottomOut)), Boolean.TRUE.equals(mFeature.get(sForceConvertIndustryHeader)), Boolean.TRUE.equals(mFeature.get(sCropMtopData)), Boolean.TRUE.equals(mFeature.get(sEnableCompatibleSmallWindow)), Boolean.TRUE.equals(mFeature.get(sDisableStreamingNetwork)), Boolean.TRUE.equals(mFeature.get(sEnableNewUserBehavior)), Boolean.TRUE.equals(mFeature.get(sMockTBLiveTinyShop)), Boolean.TRUE.equals(mFeature.get(sForceConvertUltron))}, new DialogInterface.OnMultiChoiceClickListener() { // from class: com.taobao.android.detail.ttdetail.feature.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4add8c27", new Object[]{this, dialogInterface, new Integer(i), new Boolean(z)});
                    return;
                }
                String str = strArr[i];
                a.mFeature.put(str, Boolean.valueOf(z));
                i.a("DevFeature", "user switchDevFeature: " + str + " to value: " + z + " Manually");
            }
        }).setCancelable(false).setNegativeButton("dismiss", new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.feature.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    dialogInterface.dismiss();
                }
            }
        }).create().show();
    }
}

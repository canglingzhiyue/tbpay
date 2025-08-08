package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public class snu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_LOFT = "shopLoft";

    static {
        kge.a(-1425058639);
    }

    public static /* synthetic */ void a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff16fb7d", new Object[]{snvVar});
        } else {
            b(snvVar);
        }
    }

    public static snv a(FluidContext fluidContext, Context context, a.d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("4921643", new Object[]{fluidContext, context, dVar, str}) : b(fluidContext, context, dVar, str, 0, 0, null, null, null, false);
    }

    public static snv a(FluidContext fluidContext, Context context, String str, a.d dVar, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("80f81949", new Object[]{fluidContext, context, str, dVar, str2, str3, str4, new Boolean(z)}) : b(fluidContext, context, dVar, str2, 0, 0, str3, str4, str, z);
    }

    public static snv a(FluidContext fluidContext, Context context, a.d dVar, String str, int i, int i2, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("351ad07d", new Object[]{fluidContext, context, dVar, str, new Integer(i), new Integer(i2), str2, str3, str4, new Boolean(z)}) : b(fluidContext, context, dVar, str, i, i2, str2, str3, str4, z);
    }

    public static snv a(FluidContext fluidContext, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("164759b3", new Object[]{fluidContext, context, str}) : b(fluidContext, context, null, null, 0, 0, str, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02a0 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ad A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d1 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e5 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031b A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0352 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0364 A[Catch: Throwable -> 0x006a, TRY_LEAVE, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d2 A[Catch: Throwable -> 0x006a, TRY_ENTER, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0247 A[Catch: Throwable -> 0x006a, TryCatch #1 {Throwable -> 0x006a, blocks: (B:8:0x005c, B:13:0x0070, B:16:0x0078, B:22:0x009a, B:28:0x00b1, B:30:0x00b7, B:31:0x00c8, B:33:0x00ce, B:35:0x00dc, B:44:0x0105, B:53:0x011a, B:57:0x0129, B:61:0x015a, B:63:0x0180, B:65:0x0191, B:67:0x019a, B:69:0x019f, B:72:0x01bc, B:75:0x01d2, B:77:0x01d8, B:79:0x01e2, B:80:0x01e6, B:82:0x01f2, B:84:0x01f8, B:85:0x01fd, B:87:0x020d, B:89:0x0212, B:91:0x0221, B:93:0x023b, B:94:0x0242, B:96:0x024a, B:99:0x0255, B:100:0x025c, B:101:0x0270, B:103:0x0286, B:108:0x028f, B:110:0x02a0, B:114:0x02ad, B:115:0x02b1, B:119:0x02bf, B:121:0x02d1, B:122:0x02d5, B:124:0x02e5, B:125:0x02e8, B:127:0x031b, B:128:0x032b, B:130:0x0352, B:131:0x035e, B:133:0x0364, B:112:0x02a6, B:107:0x028c, B:95:0x0247, B:88:0x0210, B:71:0x01ae, B:64:0x0189, B:39:0x00e7, B:41:0x00ef, B:43:0x00f5, B:51:0x0113, B:20:0x0089, B:21:0x0092, B:24:0x00a3), top: B:141:0x005c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static tb.snv b(final com.taobao.android.fluid.core.FluidContext r16, final android.content.Context r17, com.taobao.android.fluid.framework.data.datamodel.a.d r18, java.lang.String r19, int r20, int r21, java.lang.String r22, java.lang.String r23, final java.lang.String r24, final boolean r25) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.snu.b(com.taobao.android.fluid.core.FluidContext, android.content.Context, com.taobao.android.fluid.framework.data.datamodel.a$d, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, boolean):tb.snv");
    }

    private static void b(snv snvVar) {
        sor sorVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9a01fe", new Object[]{snvVar});
        } else if (snvVar == null || (sorVar = (sor) snvVar.f().getTag(R.id.fluid_sdk_tag_preloadVideo)) == null) {
        } else {
            sorVar.b();
        }
    }

    private static sjp a(FluidContext fluidContext, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (sjp) ipChange.ipc$dispatch("39d986c7", new Object[]{fluidContext, context, new Boolean(z)});
        }
        sjp sjpVar = new sjp();
        sjpVar.f33634a = true;
        if (fluidContext != null) {
            sjpVar.b = z || spj.d(fluidContext);
            sjpVar.c = z || soq.a(fluidContext);
        }
        if (z || ((IContainerService) fluidContext.getService(IContainerService.class)).isHighActionbar()) {
            z2 = true;
        }
        sjpVar.d = z2;
        if (sjt.u()) {
            sjpVar.f = sjs.b(context, spj.l(fluidContext));
        } else {
            sjpVar.f = sjs.c(context, sjpVar.d);
        }
        return sjpVar;
    }

    private static HashMap<String, String> a(FluidContext fluidContext, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9c991015", new Object[]{fluidContext, dVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (activeCardCommonTrack != null) {
            b.a(fluidContext, activeCardCommonTrack, dVar.f12530a);
            hashMap.putAll(activeCardCommonTrack);
        }
        HashMap hashMap2 = new HashMap();
        noi.a(fluidContext, hashMap2, dVar.f12530a);
        noi.a(hashMap2, 0);
        noi.a(hashMap, hashMap2);
        hashMap.put("spm", obw.f31903a);
        hashMap.put(b.PROPERTY_VIDEO_ID, dVar.l());
        if (StringUtils.isEmpty(dVar.f12530a.e())) {
            hashMap2.put("taoke_accountId", dVar.f12530a.c());
        } else {
            hashMap2.put("taoke_accountId", dVar.f12530a.d());
            hashMap2.put("keyname", dVar.f12530a.e());
        }
        if (j != null && !StringUtils.isEmpty(j.w)) {
            hashMap.put(com.taobao.tao.content.business.b.BIZ_TYPE, j.w);
        }
        Map<String, String> c = sessionParams.c();
        String str = sessionParams.c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(b.PROPERTY_VIDEO_ID, (Object) dVar.l());
        jSONObject.put("feed_id", (Object) dVar.a());
        jSONObject.put("page", (Object) str);
        hashMap.put(b.PROPERTY_UCM, jSONObject.toJSONString());
        hashMap.put("page", str);
        hashMap.put("content_id", dVar.a());
        hashMap.put("platform", "phone");
        if (c != null) {
            hashMap.putAll(c);
        }
        t trackTint = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackTint();
        if (trackTint != null) {
            hashMap.putAll(trackTint.a());
        }
        return hashMap;
    }

    private static HashMap<String, String> a(FluidContext fluidContext, int i, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7e827747", new Object[]{fluidContext, new Integer(i), cVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (cVar == null) {
            return hashMap;
        }
        String str = "Android_" + cVar.g() + "_" + UUID.randomUUID();
        String str2 = Integer.valueOf(((IHostAppService) fluidContext.getService(IHostAppService.class)).getCurrentTabIndex()).intValue() == 1 ? "follow" : "recommend";
        hashMap.put(snv.EXP_KEY_FULL_PAGE_UID, str);
        hashMap.put(snv.EXP_KEY_FULL_PAGE_TITLE, cVar.C());
        hashMap.put(snv.EXP_KEY_FULL_PAGE_INDEX, String.valueOf(i));
        hashMap.put(snv.EXP_KEY_FULL_PAGE_TAB_NAME, str2);
        hashMap.put(snv.EXP_KEY_FULL_PAGE_CONTENT_TYPE, cVar.H());
        hashMap.put("videoActionType", "init");
        a(fluidContext, hashMap);
        t trackTint = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackTint();
        if (trackTint != null) {
            hashMap.putAll(trackTint.a());
        }
        return hashMap;
    }

    public static void a(FluidContext fluidContext, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01c1fd9", new Object[]{fluidContext, hashMap});
            return;
        }
        long a2 = com.taobao.android.fluid.business.usertrack.track.a.a(fluidContext);
        long beforeDetailMtopTime = ((IDataService) fluidContext.getService(IDataService.class)).getBeforeDetailMtopTime();
        long detailMtopSuccessTIme = ((IDataService) fluidContext.getService(IDataService.class)).getDetailMtopSuccessTIme();
        hashMap.put("qpy_apm_oncreate_to_detail", String.valueOf(beforeDetailMtopTime - a2));
        hashMap.put("qpy_apm_detail_mtop", String.valueOf(detailMtopSuccessTIme - beforeDetailMtopTime));
        hashMap.put("qpy_apm_detail_mtop_to_build_dw", String.valueOf(System.currentTimeMillis() - detailMtopSuccessTIme));
    }

    public static snv a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snv) ipChange.ipc$dispatch("24f95f91", new Object[]{fluidContext});
        }
        snv dWInstance = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getDWInstance();
        if (dWInstance != null) {
            ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).setDWInstance(null);
        }
        return dWInstance;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enablePreCreateDwInstanceSetPic", true);
    }
}

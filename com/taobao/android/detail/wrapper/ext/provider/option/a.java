package com.taobao.android.detail.wrapper.ext.provider.option;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.performance.UmbrellaProcessTracker;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bpp;
import tb.ecu;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements com.taobao.android.detail.datasdk.protocol.adapter.optional.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11343a;

    static {
        kge.a(349552969);
        kge.a(1125657551);
        f11343a = false;
    }

    public a() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.option.TBAppMonitorProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            UmbrellaProcessTracker.register(str);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            UmbrellaProcessTracker.addArgs(str, str2, str3);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            UmbrellaProcessTracker.setChildBizName(str, str2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            UmbrellaProcessTracker.commit(str);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
        } else {
            UmbrellaProcessTracker.addProcess(str, c(str2), j);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfaf3e", new Object[]{this, str, str2, str3, new Long(j)});
        } else {
            UmbrellaProcessTracker.addSubProcess(str, c(str2), str3, j);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r7.equals(tb.ept.LIFECYCLE) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.android.umbrella.performance.d c(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.wrapper.ext.provider.option.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "834860f6"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.alibaba.android.umbrella.performance.d r7 = (com.alibaba.android.umbrella.performance.d) r7
            return r7
        L18:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.INIT
            r1 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -826828279: goto L68;
                case -377785047: goto L5e;
                case -331876534: goto L55;
                case 3237136: goto L4b;
                case 859225109: goto L41;
                case 939008391: goto L37;
                case 1369272769: goto L2d;
                case 1842531918: goto L23;
                default: goto L22;
            }
        L22:
            goto L72
        L23:
            java.lang.String r2 = "netWork"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L72
            r2 = 2
            goto L73
        L2d:
            java.lang.String r2 = "createView"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L72
            r2 = 5
            goto L73
        L37:
            java.lang.String r2 = "bindData"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L72
            r2 = 6
            goto L73
        L41:
            java.lang.String r2 = "pageLoad"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L72
            r2 = 7
            goto L73
        L4b:
            java.lang.String r2 = "init"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L72
            r2 = 0
            goto L73
        L55:
            java.lang.String r3 = "lifeCycle"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L72
            goto L73
        L5e:
            java.lang.String r2 = "dataParse"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L72
            r2 = 3
            goto L73
        L68:
            java.lang.String r2 = "drawView"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L72
            r2 = 4
            goto L73
        L72:
            r2 = -1
        L73:
            switch(r2) {
                case 0: goto L8c;
                case 1: goto L89;
                case 2: goto L86;
                case 3: goto L83;
                case 4: goto L80;
                case 5: goto L7d;
                case 6: goto L7a;
                case 7: goto L77;
                default: goto L76;
            }
        L76:
            goto L8e
        L77:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.PAGELOAD
            goto L8e
        L7a:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.SUB_BIND_VIEW
            goto L8e
        L7d:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.SUB_CREATE_VIEW
            goto L8e
        L80:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.DRAWVIEW
            goto L8e
        L83:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.DATAPARSE
            goto L8e
        L86:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.NETWORK
            goto L8e
        L89:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.LIFECYCLE
            goto L8e
        L8c:
            com.alibaba.android.umbrella.performance.d r0 = com.alibaba.android.umbrella.performance.d.INIT
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.ext.provider.option.a.c(java.lang.String):com.alibaba.android.umbrella.performance.d");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, Map<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        String str8 = "";
        if (map != null) {
            if (map.containsKey("featureType")) {
                str6 = map.get("featureType");
                map.remove("featureType");
            } else {
                str6 = str8;
            }
            if (map.containsKey("tagId")) {
                str7 = map.get("tagId");
                map.remove("tagId");
            } else {
                str7 = str8;
            }
            if (map.containsKey("childBizName")) {
                str8 = map.get("childBizName");
                map.remove("childBizName");
            }
            str5 = str8;
            str3 = str6;
            str4 = str7;
        } else {
            str3 = str8;
            str4 = str3;
            str5 = str4;
        }
        try {
            UMLinkLogInterface a2 = bpp.a();
            if (StringUtils.isEmpty(str)) {
                str = "Page_Detail";
            }
            a2.commitSuccess(str3, str4, "2.0", str, str5, map);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, Map<String, String> map, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fae8b1d", new Object[]{this, str, str2, map, str3, str4});
            return;
        }
        String str10 = "";
        if (map != null) {
            if (map.containsKey("featureType")) {
                str8 = map.get("featureType");
                map.remove("featureType");
            } else {
                str8 = str10;
            }
            if (map.containsKey("tagId")) {
                str9 = map.get("tagId");
                map.remove("tagId");
            } else {
                str9 = str10;
            }
            if (map.containsKey("childBizName")) {
                str10 = map.get("childBizName");
                map.remove("childBizName");
            }
            str7 = str10;
            str5 = str8;
            str6 = str9;
        } else {
            str5 = str10;
            str6 = str5;
            str7 = str6;
        }
        try {
            bpp.a().commitFailure(str5, str6, "2.0", StringUtils.isEmpty(str) ? "Page_Detail" : str, str7, map, str3, str4);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, Map<String, Object> map) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        String str4 = "";
        if (map != null) {
            if (map.get("childBizName") != null) {
                str3 = map.get("childBizName").toString();
                map.remove("childBizName");
            } else {
                str3 = str4;
            }
            if (map.get("childBizCode") != null) {
                str4 = map.get("childBizCode").toString();
                map.remove("childBizCode");
            }
            str2 = str3;
        } else {
            str2 = str4;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMTagKey.TAG_1, str4);
        hashMap.put(UMTagKey.TAG_2, str2);
        a2.logPageLifecycle("Page_Detail", str2, null, d(str), 0, null, null, hashMap, com.alibaba.android.umbrella.link.export.a.a(map));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int d(String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{this, str})).intValue();
        }
        switch (str.hashCode()) {
            case -1881311847:
                if (str.equals(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_RELOAD)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1686093949:
                if (str.equals(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_DISAPPEAR)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2342118:
                if (str.equals("LOAD")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 66129592:
                if (str.equals(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_ENTER)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 72308375:
                if (str.equals(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_LEAVE)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1937228181:
                if (str.equals(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_APPEAR)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1937228570:
                if (str.equals(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_APPEND)) {
                    c = 1;
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
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 0;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 5;
            default:
                return -1;
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, String str3, Map<String, Object> map) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        String str6 = "";
        if (map != null) {
            if (map.get("childBizName") != null) {
                str5 = map.get("childBizName").toString();
                map.remove("childBizName");
            } else {
                str5 = str6;
            }
            if (map.get("childBizCode") != null) {
                str6 = map.get("childBizCode").toString();
                map.remove("childBizCode");
            }
            str4 = str5;
        } else {
            str4 = str6;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMTagKey.TAG_1, str6);
        hashMap.put(UMTagKey.TAG_2, str4);
        a2.logMtopReq("Page_Detail", str4, null, str, str2, str3, hashMap, com.alibaba.android.umbrella.link.export.a.a(map));
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(Object obj, Map<String, Object> map) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        String str3 = "";
        if (map != null) {
            if (map.get("childBizName") != null) {
                str2 = map.get("childBizName").toString();
                map.remove("childBizName");
            } else {
                str2 = str3;
            }
            if (map.get("childBizCode") != null) {
                str3 = map.get("childBizCode").toString();
                map.remove("childBizCode");
            }
            str = str2;
        } else {
            str = str3;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMTagKey.TAG_1, str3);
        hashMap.put(UMTagKey.TAG_2, str);
        a2.logMtopResponse("Page_Detail", str, null, obj, null, hashMap, com.alibaba.android.umbrella.link.export.a.a(map));
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void b(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        String str5 = "";
        if (map != null) {
            if (map.get("childBizName") != null) {
                str4 = map.get("childBizName").toString();
                map.remove("childBizName");
            } else {
                str4 = str5;
            }
            if (map.get("childBizCode") != null) {
                str3 = map.get("childBizCode").toString();
                map.remove("childBizCode");
            } else {
                str3 = str5;
            }
            if (map.get("templateName") != null) {
                str5 = map.get("templateName").toString();
                map.remove("templateName");
            }
            str2 = str5;
            str5 = str4;
        } else {
            str2 = str5;
            str3 = str2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.TAG_1, str3);
        hashMap.put(UMDimKey.TAG_2, str5);
        hashMap.put(UMDimKey.TAG_3, str2);
        a2.logInfo("Page_Detail", str5, str, null, hashMap, com.alibaba.android.umbrella.link.export.a.a(map));
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void c(String str, String str2, String str3, Map<String, Object> map) {
        String str4;
        Map<String, Object> map2 = map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4581a8bd", new Object[]{this, str, str2, str3, map2});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        String str5 = "";
        if (map2 != null) {
            if (map2.get("childBizName") != null) {
                str4 = map2.get("childBizName").toString();
                map2.remove("childBizName");
            } else {
                str4 = str5;
            }
            if (map2.get("childBizCode") != null) {
                str5 = map2.get("childBizCode").toString();
                map2.remove("childBizCode");
            }
            map2.put("component", str2);
        } else {
            map2 = new HashMap<>();
            map2.put("component", str2);
            str4 = str5;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMTagKey.TAG_1, str5);
        hashMap.put(UMTagKey.TAG_2, str4);
        a2.logUIAction2("Page_Detail", str4, null, e(str3), "", "", "", "", hashMap, com.alibaba.android.umbrella.link.export.a.a(map2));
    }

    private int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{this, str})).intValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1926005497) {
            if (hashCode == 110550847 && str.equals("touch")) {
                c = 0;
            }
        } else if (str.equals("exposure")) {
            c = 1;
        }
        return (c == 0 || c != 1) ? 0 : 1;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void b(String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10af9e", new Object[]{this, str, str2, str3, map});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        String str6 = "";
        if (map != null) {
            if (map.get("childBizName") != null) {
                str5 = map.get("childBizName").toString();
                map.remove("childBizName");
            } else {
                str5 = str6;
            }
            if (map.get("childBizCode") != null) {
                str6 = map.get("childBizCode").toString();
                map.remove("childBizCode");
            }
            str4 = str5;
        } else {
            str4 = str6;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.TAG_1, str6);
        hashMap.put(UMDimKey.TAG_2, str4);
        a2.logError("Page_Detail", str4, str, null, str2, str3, hashMap, com.alibaba.android.umbrella.link.export.a.a(map));
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{this, str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (!f11343a) {
            f11343a = true;
            AppMonitor.register("Page_Detail", "详情页面性能", (MeasureSet) null, DimensionSet.create().addDimension("mInit").addDimension("mReq").addDimension("mLoad").addDimension("mProcessData").addDimension("mThreadSwitch").addDimension("mCreateDetailModel").addDimension("mCreateViewModel").addDimension("mFetchTemplate").addDimension("mCreateProtocolMap").addDimension("mCreateLayoutModel").addDimension("mTemplateFromMem").addDimension("mTemplateFromFile").addDimension("mTemplateFromNetwork").addDimension("mTemplateParseJSON").addDimension("load").addDimension("mUpdate").addDimension("optimizeEnable").addDimension("protocol").addDimension("dinamicV3Enable").addDimension("mMtop"));
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.put("protocol", ecu.L);
        hashMap.put("dinamicV3Enable", ecu.r + "");
        DimensionValueSet create = DimensionValueSet.create();
        create.setMap(hashMap);
        AppMonitor.Stat.commit("Page_Detail", "详情页面性能", create, (MeasureValueSet) null);
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.a
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2);
        }
    }
}

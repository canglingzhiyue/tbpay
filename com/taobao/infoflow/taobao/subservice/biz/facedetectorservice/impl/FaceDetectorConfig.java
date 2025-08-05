package com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.ldf;
import tb.ljs;

/* loaded from: classes7.dex */
public class FaceDetectorConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f17458a;
    private final IContainerDataService<?> b;
    private JSONObject c;
    private FaceDetectionConfigInfo d;

    static {
        kge.a(1468492002);
    }

    public static /* synthetic */ void a(FaceDetectorConfig faceDetectorConfig, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3f4f64", new Object[]{faceDetectorConfig, iContainerDataModel});
        } else {
            faceDetectorConfig.a(iContainerDataModel);
        }
    }

    public FaceDetectorConfig(ljs ljsVar) {
        this.f17458a = ljsVar;
        this.b = (IContainerDataService) this.f17458a.a(IContainerDataService.class);
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f17458a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("FaceDetectorConfig", "containerDataService == null");
            return;
        }
        this.c = f();
        this.d = (FaceDetectionConfigInfo) JSON.toJavaObject(this.c, FaceDetectionConfigInfo.class);
        iContainerDataService.addDataProcessListener(e());
    }

    private IContainerDataService.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("39a36f61", new Object[]{this}) : 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: RETURN  
              (wrap: com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a : ?: TERNARYnull = ((wrap: boolean : 0x0002: INSTANCE_OF  (r1v0 boolean A[REMOVE]) = (r0v0 'ipChange' com.android.alibaba.ip.runtime.IpChange) com.android.alibaba.ip.runtime.IpChange) != false) ? (wrap: com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a : 0x0012: CHECK_CAST (r0v3 com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a A[REMOVE]) = (com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a) (wrap: java.lang.Object : 0x000e: INVOKE  (r0v2 java.lang.Object A[REMOVE]) = 
              (r0v0 'ipChange' com.android.alibaba.ip.runtime.IpChange)
              ("39a36f61")
              (wrap: java.lang.Object[] : ?: FILLED_NEW_ARRAY  (r1v2 java.lang.Object[] A[REMOVE]) = 
              (r3v0 'this' com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig A[IMMUTABLE_TYPE, THIS])
             elemType: java.lang.Object)
             type: INTERFACE call: com.android.alibaba.ip.runtime.IpChange.ipc$dispatch(java.lang.String, java.lang.Object[]):java.lang.Object)) : (wrap: com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a : 0x0017: CONSTRUCTOR  (r0v1 com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a A[REMOVE]) = 
              (r3v0 'this' com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             call: tb.sfs.1.<init>(com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig):void type: CONSTRUCTOR))
             in method: com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig.e():com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:371)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.sfs, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1083)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:513)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
            	... 15 more
            */
        /*
            this = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r2 = "39a36f61"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a r0 = (com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a) r0
            return r0
        L15:
            tb.sfs$1 r0 = new tb.sfs$1
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig.e():com.taobao.infoflow.protocol.subservice.framework.IContainerDataService$a");
    }

    private void a(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null) {
        } else {
            this.c = a(base);
            this.d = (FaceDetectionConfigInfo) JSON.toJavaObject(this.c, FaceDetectionConfigInfo.class);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            ldf.d("FaceDetectorConfig", "containerDataService == null");
            return null;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            ldf.d("FaceDetectorConfig", "containerData == null");
            return null;
        }
        return a(containerData.getBase());
    }

    private JSONObject a(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27067895", new Object[]{this, iContainerInnerDataModel});
        }
        if (iContainerInnerDataModel == null) {
            ldf.d("FaceDetectorConfig", "baseData == null");
            return null;
        }
        JSONObject ext = iContainerInnerDataModel.getExt();
        if (ext == null) {
            ldf.d("FaceDetectorConfig", "ext == null");
            return null;
        }
        return ext.getJSONObject("homeGlobalABTest");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        FaceDetectionConfigInfo faceDetectionConfigInfo = this.d;
        if (faceDetectionConfigInfo == null) {
            return false;
        }
        return faceDetectionConfigInfo.enableOpenFaceDetector;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        FaceDetectionConfigInfo faceDetectionConfigInfo = this.d;
        if (faceDetectionConfigInfo == null) {
            return false;
        }
        return faceDetectionConfigInfo.isNeedLocalScale;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        FaceDetectionConfigInfo faceDetectionConfigInfo = this.d;
        if (faceDetectionConfigInfo == null) {
            return false;
        }
        return faceDetectionConfigInfo.isNeedAddSelectView;
    }

    public FaceDetectionConfigInfo g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceDetectionConfigInfo) ipChange.ipc$dispatch("38b53569", new Object[]{this}) : this.d;
    }

    /* loaded from: classes7.dex */
    public static class FaceDetectionConfigInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String preDetectionIntervalTime = "10";
        public String intervalTime = "600";
        public String preDetectionThreshold = "3";
        public String detectionContinuedFailThreshold = "5";
        public String detectionContinuedErrorCloseThreshold = "10";
        public String detectionContinuedFailCloseThreshold = "10";
        public String continuedIsNotFarApartThreshold = "2";
        public String continuedIsNotFarApartCloseThreshold = "10";
        public String continuedIsFarApartThreshold = "3";
        public ArrayList<Float> farApartThresholdList = new ArrayList<>();
        public HashMap<Float, ArrayList<Float>> areaRatioToScaleMap = new HashMap<>();
        public boolean enableOpenFaceDetector = false;
        public boolean isNeedLocalScale = false;
        public boolean isNeedResultStatistics = false;
        public boolean isNeedAddSelectView = false;

        static {
            kge.a(-671329290);
            kge.a(1028243835);
        }

        public void defaultAreaRatioToScaleMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f2944f1", new Object[]{this});
                return;
            }
            ArrayList<Float> arrayList = new ArrayList<>();
            arrayList.add(Float.valueOf(1.4f));
            arrayList.add(Float.valueOf(1.2f));
            ArrayList<Float> arrayList2 = new ArrayList<>();
            arrayList2.add(Float.valueOf(1.8f));
            arrayList2.add(Float.valueOf(1.6f));
            ArrayList<Float> arrayList3 = new ArrayList<>();
            arrayList3.add(Float.valueOf(2.0f));
            arrayList3.add(Float.valueOf(1.8f));
            this.areaRatioToScaleMap.put(Float.valueOf(2.5f), arrayList);
            this.areaRatioToScaleMap.put(Float.valueOf(4.0f), arrayList2);
            this.areaRatioToScaleMap.put(Float.valueOf(6.0f), arrayList3);
            this.farApartThresholdList.add(Float.valueOf(2.5f));
            this.farApartThresholdList.add(Float.valueOf(4.0f));
            this.farApartThresholdList.add(Float.valueOf(6.0f));
        }

        public ArrayList<Float> getFarApartScaleList(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("7287953e", new Object[]{this, new Float(f)});
            }
            if (this.farApartThresholdList.isEmpty() || this.areaRatioToScaleMap.isEmpty()) {
                defaultAreaRatioToScaleMap();
            }
            float f2 = 0.0f;
            int size = this.farApartThresholdList.size();
            for (int i = 0; i < size && this.farApartThresholdList.get(i).floatValue() <= f; i++) {
                f2 = this.farApartThresholdList.get(i).floatValue();
            }
            return this.areaRatioToScaleMap.get(Float.valueOf(f2));
        }

        public int getDetectionContinuedErrorCloseThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcc26f07", new Object[]{this})).intValue();
            }
            try {
                return Integer.parseInt(this.detectionContinuedErrorCloseThreshold);
            } catch (NumberFormatException unused) {
                return 10;
            }
        }

        public int getDetectionContinuedFailCloseThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49285b39", new Object[]{this})).intValue();
            }
            try {
                return Integer.parseInt(this.detectionContinuedFailCloseThreshold);
            } catch (NumberFormatException unused) {
                return 10;
            }
        }
    }
}

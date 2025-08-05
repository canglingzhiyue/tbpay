package com.taobao.umipublish.extension.windvane.abilities;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.marvel.Exporter;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.c;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.n;
import com.taobao.android.litecreator.util.u;
import com.taobao.taopai.material.a;
import com.taobao.taopai.material.bean.MaterialResource;
import com.taobao.taopai.material.request.materialdetail.b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.acg;
import tb.hdx;
import tb.kge;
import tb.qby;
import tb.qnt;
import tb.ruw;
import tb.tek;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J6\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\r0\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility;", "Lcom/taobao/umipublish/extension/windvane/abilities/BaseAbility;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "base64Encode", "", BaseJsExecutor.NAME_IMAGE_LIST, "", "Lcom/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility$Image;", "limitSize", "", "checkIfFinished", "", "findMainClipId", "editor", "Lcom/alibaba/marvel/MeEditor;", "onExecute", "params", "Lcom/alibaba/fastjson/JSONObject;", "strokeImageAndExport", "marvelJSONPath", "marvelPath", "imagePath", "success", "Lkotlin/Function2;", qnt.TYPE_IMAGE, "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class ImageStokeAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final String f23331a = "ImageStokeAbility";
    private List<Image> b = new ArrayList();
    private int c = 1024;
    private boolean d;

    static {
        kge.a(447905535);
    }

    public static /* synthetic */ Object ipc$super(ImageStokeAbility imageStokeAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(ImageStokeAbility imageStokeAbility, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4cd4c42", new Object[]{imageStokeAbility, str});
        } else {
            imageStokeAbility.a(str);
        }
    }

    public static final /* synthetic */ void access$setBase64Encode$p(ImageStokeAbility imageStokeAbility, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565430ea", new Object[]{imageStokeAbility, new Boolean(z)});
        } else {
            imageStokeAbility.d = z;
        }
    }

    public static final /* synthetic */ void c(ImageStokeAbility imageStokeAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7aa5fa", new Object[]{imageStokeAbility});
        } else {
            imageStokeAbility.a();
        }
    }

    public static final /* synthetic */ boolean d(ImageStokeAbility imageStokeAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8228d0bf", new Object[]{imageStokeAbility})).booleanValue() : imageStokeAbility.d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility$Image;", "", "inputPath", "", "outputPath", "base64", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBase64", "()Ljava/lang/String;", "setBase64", "(Ljava/lang/String;)V", "getInputPath", "setInputPath", "getOutputPath", "setOutputPath", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class Image {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private String f23332a;
        private String b;
        private String c;

        static {
            kge.a(290927446);
        }

        public Image(String inputPath, String str, String str2) {
            q.d(inputPath, "inputPath");
            this.f23332a = inputPath;
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f23332a;
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        JSONArray<Object> a2 = m.a(jSONObject, "imagePaths");
        ArrayList arrayList = null;
        if (a2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : a2) {
                arrayList2.add(new Image(obj.toString(), null, null));
            }
            arrayList = arrayList2;
        }
        this.b = arrayList;
        this.c = m.a(jSONObject, "limitSize", 1024);
        this.d = m.a(jSONObject, "base64Encode", false);
        List<Image> list = this.b;
        if (list != null && list.isEmpty()) {
            errorCallback("EmptyInputImages", "EmptyInputImages");
            return;
        }
        b bVar = new b(tek.p());
        bVar.a(true);
        bVar.a(2592000L);
        bVar.a(hdx.LE_VERSION);
        u.b(this.f23331a, "ImageStokeAbility.downloadMaterialRes.Start");
        new a(this.mContext, "guangguang", "guangguang").a(acg.a(), bVar, new qby() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility$onExecute$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qby
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.qbu
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                ImageStokeAbility imageStokeAbility = ImageStokeAbility.this;
                String str3 = ImageStokeAbility.$ipChange;
                u.d(str3, "ImageStokeAbility.downloadMaterialRes.onFail: errorCode:" + str + ", errorInfo:" + str2);
                ImageStokeAbility.this.errorCallback(str, str2);
            }

            @Override // tb.qby
            public void a(MaterialResource materialResource) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a53722e5", new Object[]{this, materialResource});
                    return;
                }
                String a3 = q.a(materialResource != null ? materialResource.getDirPath() : null, (Object) "/marvel.json");
                if (!k.a(a3)) {
                    ImageStokeAbility imageStokeAbility = ImageStokeAbility.this;
                    String str = ImageStokeAbility.$ipChange;
                    u.d(str, "ImageStokeAbility.downloadMaterialRes.FileNotExist: marvelJSONPath:" + a3);
                    ImageStokeAbility.this.errorCallback("MAIFileNotExist", "MAIFileNotExist");
                    return;
                }
                ImageStokeAbility imageStokeAbility2 = ImageStokeAbility.this;
                String str2 = ImageStokeAbility.$ipChange;
                u.b(str2, "ImageStokeAbility.downloadMaterialRes.onSuccess: marvelJSONPath:" + a3);
                ImageStokeAbility.a(ImageStokeAbility.this, a3);
            }
        });
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        List<Image> list = this.b;
        if (list == null) {
            return;
        }
        for (Image image : list) {
            a(str, image.a(), new ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1(image, this, str));
        }
    }

    private final void a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<Image> list = this.b;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Image image = (Image) obj;
                if (TextUtils.isEmpty(image.b()) && TextUtils.isEmpty(image.c())) {
                    arrayList.add(obj);
                }
            }
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return;
        }
        if (this.d) {
            JSONArray jSONArray = new JSONArray();
            List<Image> list2 = this.b;
            if (list2 != null) {
                for (Image image2 : list2) {
                    jSONArray.add(image2.c());
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imageBase64Infos", (Object) jSONArray);
            u.b(this.f23331a, "ImageStokeAbility.strokeImageAndExport.Success.Base64");
            successCallback(jSONObject);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        List<Image> list3 = this.b;
        if (list3 != null) {
            for (Image image3 : list3) {
                jSONArray2.add(image3.b());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("imagePaths", (Object) jSONArray2);
        u.b(this.f23331a, "ImageStokeAbility.strokeImageAndExport.Success");
        successCallback(jSONObject2);
    }

    private final void a(String str, String str2, final ruw<? super String, ? super String, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3808d8", new Object[]{this, str, str2, ruwVar});
            return;
        }
        final int i = this.c;
        Project project = Marvel.createProject();
        project.load(str, (ResourceInspector) null);
        q.b(project, "project");
        MeEditor editor = project.getMeEditor();
        Exporter imageExporter = new ImageExporter();
        q.b(editor, "editor");
        String a2 = a(editor);
        editor.setCanvasSize(1024, 1024);
        editor.changeClipRes(a2, str2, (Map) null);
        imageExporter.setWidth(i);
        imageExporter.setHeight(i);
        imageExporter.setCompressFormat(Bitmap.CompressFormat.PNG);
        imageExporter.setBackgroundColor(0L);
        imageExporter.setBitmapListener(new ImageExporter.a() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility$strokeImageAndExport$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public final void a(long j, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e290dcb5", new Object[]{this, new Long(j), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), byteBuffer});
                    return;
                }
                int i6 = i;
                Bitmap createBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(byteBuffer);
                if (ImageStokeAbility.d(ImageStokeAbility.this)) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    ruwVar.mo2423invoke(null, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                    return;
                }
                String e = n.e(ImageStokeAbility.this.mContext);
                c.a(createBitmap, e, 90, true);
                ruwVar.mo2423invoke(e, null);
            }
        });
        project.export(imageExporter);
    }

    private final String a(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bee037b", new Object[]{this, meEditor});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        meEditor.getTrackIdList("main", arrayList);
        meEditor.getClipIdList((String) arrayList.get(0), arrayList2);
        return (String) arrayList2.get(0);
    }
}

package com.taobao.umipublish.extension.windvane.abilities;

import android.graphics.Bitmap;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.ImageExporter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.g;
import com.taobao.android.litecreator.util.c;
import com.taobao.android.litecreator.util.n;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.Globals;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.weex.common.Constants;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes9.dex */
public class ImageWaterMarkAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ImageWaterMarkAbility";

    static {
        kge.a(-232124285);
    }

    public static /* synthetic */ Object ipc$super(ImageWaterMarkAbility imageWaterMarkAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("10001", "EMPTY_PARAMS");
        } else {
            a(jSONObject.getString("waterMarkUrl"), jSONObject.getString("imagePath"));
        }
    }

    private void a(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("downloadList", (Object) jSONArray);
        jSONObject2.put("url", (Object) str);
        jSONObject2.put(Constants.Name.SUFFIX, (Object) ".jpg");
        jSONArray.add(jSONObject2);
        DownloadFilesAbility downloadFilesAbility = new DownloadFilesAbility();
        downloadFilesAbility.setContext(Globals.getApplication());
        downloadFilesAbility.setListener(new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageWaterMarkAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                    return;
                }
                try {
                    String string = jSONObject3.getJSONArray("fileList").getJSONObject(0).getString("path");
                    ImageBean a2 = g.a(str2);
                    final int i = a2.width;
                    final int i2 = a2.height;
                    Project createProject = Marvel.createProject();
                    MeEditor meEditor = createProject.getMeEditor();
                    meEditor.setCanvasSize(i, i2);
                    meEditor.addMainClip(str2, 0L, -1L);
                    String addPipClip = meEditor.addPipClip("", string, 0L, 0L, -1L);
                    meEditor.setScale(addPipClip, 0.223f);
                    meEditor.setPosition(addPipClip, 0.473f, 0.466f);
                    meEditor.setAnchor(addPipClip, 0.5f, 0.5f);
                    ImageExporter imageExporter = new ImageExporter();
                    imageExporter.setWidth(i);
                    imageExporter.setHeight(i2);
                    imageExporter.setBitmapListener(new ImageExporter.a() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageWaterMarkAbility.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public void a(long j, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("e290dcb5", new Object[]{this, new Long(j), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), byteBuffer});
                                return;
                            }
                            String c = n.c(ImageWaterMarkAbility.this.mContext);
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(byteBuffer);
                            c.a(createBitmap, c);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("filePath", (Object) c);
                            ImageWaterMarkAbility.this.successCallback(jSONObject4);
                        }
                    });
                    createProject.export(imageExporter);
                } catch (Throwable th) {
                    ImageWaterMarkAbility.this.errorCallback("10001", "DOWNLOAD_WATERMARK_FAILED");
                    u.d(ImageWaterMarkAbility.TAG, "download water mark failed" + Log.getStackTraceString(th));
                }
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                    return;
                }
                ImageWaterMarkAbility imageWaterMarkAbility = ImageWaterMarkAbility.this;
                imageWaterMarkAbility.errorCallback("10001", "DOWNLOAD_WATERMARK_FAILED_" + str3 + "_" + str4);
                u.d(ImageWaterMarkAbility.TAG, "download water mark failed_" + str3 + "_" + str4);
            }
        });
        downloadFilesAbility.execute(jSONObject);
    }
}

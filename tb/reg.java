package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.MaterialNode;
import com.taobao.android.litecreator.sdk.editor.data.MultiVideoClips;
import com.taobao.tao.Globals;
import com.taobao.umipublish.draft.DraftMediaHelper;
import com.taobao.umipublish.draft.DraftModel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class reg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MARVEL_TEMPLATE = "marvelTemplate";
    public static final String VIDEO_EDIT_SERIALIZE_JSON = "videoEditSerialize.json";

    /* renamed from: a  reason: collision with root package name */
    private IUGCMedia f33084a;
    private DraftMediaHelper b = new DraftMediaHelper(Globals.getApplication());

    static {
        kge.a(1338021315);
    }

    public reg(IUGCMedia iUGCMedia) {
        this.f33084a = iUGCMedia;
    }

    public void a(IUGCMedia iUGCMedia, DraftModel draftModel, final DraftMediaHelper.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97a5316", new Object[]{this, iUGCMedia, draftModel, aVar});
        } else if (tek.b()) {
            if (iUGCMedia.getVideos() == null || iUGCMedia.getVideos().isEmpty() || iUGCMedia.getVideos().get(0).editorInfo == null) {
                aVar.a("getVideos null");
                return;
            }
            String publishSessionId = this.f33084a.getPublishSessionId();
            File a2 = this.b.a(publishSessionId, draftModel);
            EditorInfo editorInfo = iUGCMedia.getVideos().get(0).editorInfo;
            if (a2 == null || editorInfo.resource == null) {
                aVar.a("cacheDir or resource nul");
                return;
            }
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            DraftMediaHelper.a aVar2 = new DraftMediaHelper.a() { // from class: tb.reg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (atomicInteger.incrementAndGet() != 3) {
                    } else {
                        aVar.a();
                    }
                }

                @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        aVar.a(str);
                    }
                }
            };
            MultiVideoClips multiVideoClips = editorInfo.resource.compressData == null ? editorInfo.resource.originData : editorInfo.resource.compressData;
            if (multiVideoClips != null && !multiVideoClips.data.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (MultiVideoClips.MediaResource mediaResource : multiVideoClips.data) {
                    arrayList.add(mediaResource.path);
                }
                this.b.a(draftModel, publishSessionId, "resource", aVar2, arrayList);
            } else {
                aVar2.a();
            }
            if (editorInfo.material != null && !editorInfo.material.materialNodes.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (MaterialNode materialNode : editorInfo.material.materialNodes) {
                    arrayList2.add(materialNode.nodePath);
                }
                this.b.a(draftModel, publishSessionId, DraftMediaHelper.DraftType.MATERIALS, aVar2, arrayList2);
            } else {
                aVar2.a();
            }
            ArrayList arrayList3 = new ArrayList();
            File file = new File(new File(a2, DraftMediaHelper.DraftType.SERIALIZE), VIDEO_EDIT_SERIALIZE_JSON);
            arrayList3.add(file.getAbsolutePath());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(JSON.toJSONString(editorInfo).getBytes("UTF-8"));
                fileOutputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.b.a(draftModel, publishSessionId, DraftMediaHelper.DraftType.SERIALIZE, aVar2, arrayList3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.litecreator.sdk.editor.data.EditorInfo a(com.taobao.umipublish.draft.DraftModel r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.reg.a(com.taobao.umipublish.draft.DraftModel, java.lang.String):com.taobao.android.litecreator.sdk.editor.data.EditorInfo");
    }
}

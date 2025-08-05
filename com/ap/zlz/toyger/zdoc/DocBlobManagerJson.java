package com.ap.zlz.toyger.zdoc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.Blob;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.Content;
import com.alipay.zoloz.toyger.blob.DocInfo;
import com.alipay.zoloz.toyger.blob.Meta;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class DocBlobManagerJson extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(248701617);
    }

    public static /* synthetic */ Object ipc$super(DocBlobManagerJson docBlobManagerJson, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ap.zlz.toyger.zdoc.b, com.alipay.zoloz.toyger.blob.BlobManager
    public boolean isUTF8() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20ca7ec6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.ap.zlz.toyger.zdoc.b, com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] generateBlob(List<ToygerDocInfo> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("83c7cf22", new Object[]{this, list, map});
        }
        ArrayList arrayList = new ArrayList();
        for (ToygerDocInfo toygerDocInfo : list) {
            DocBlobElement docBlobElement = new DocBlobElement();
            docBlobElement.type = BlobManager.BLOB_ELEM_TYPE_DOC;
            if (toygerDocInfo.getBlobConfig() == null) {
                docBlobElement.subType = BlobManager.SUB_TYPE_DOC_IMAGE;
            } else {
                docBlobElement.subType = toygerDocInfo.getBlobConfig().subType;
            }
            docBlobElement.version = "1.0";
            docBlobElement.idx = 0;
            docBlobElement.content = processFrame(toygerDocInfo.frame, this.mCropRect);
            if (docBlobElement.content != null) {
                this.picSize = docBlobElement.content.length;
            } else {
                this.picSize = 0L;
            }
            docBlobElement.docInfo = generateDocInfo(toygerDocInfo, map);
            arrayList.add(docBlobElement);
        }
        Blob blob = new Blob();
        blob.blobElem = arrayList;
        blob.blobVersion = "1.0";
        Meta generateMeta = generateMeta(list, map);
        Content content = new Content();
        content.blob = blob;
        content.meta = generateMeta;
        return JSON.toJSONString(content).getBytes();
    }

    private DocInfo generateDocInfo(ToygerDocInfo toygerDocInfo, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocInfo) ipChange.ipc$dispatch("8d931c9f", new Object[]{this, toygerDocInfo, map});
        }
        DocInfo docInfo = new DocInfo();
        docInfo.docType = getDocType();
        docInfo.pageNo = getPageNum();
        return docInfo;
    }

    private Meta generateMeta(List<ToygerDocInfo> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Meta) ipChange.ipc$dispatch("56fd2862", new Object[]{this, list, map});
        }
        Meta meta = new Meta();
        meta.type = BlobManager.META_TYPE_DOC;
        meta.serialize = 1;
        meta.collectInfo = new HashMap();
        meta.collectInfo.put("docType", getDocType());
        meta.collectInfo.put(b.INFO_PAGE_NUMBER, Integer.valueOf(getPageNum()));
        meta.collectInfo.put(b.INFO_PIC_SIZE, Long.valueOf(this.picSize));
        if (map != null && map.size() > 0) {
            meta.collectInfo.putAll(map);
        }
        return meta;
    }

    public byte[] processFrame(TGFrame tGFrame, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("efd3539b", new Object[]{this, tGFrame, rect});
        }
        if (rect == null) {
            rect = new Rect(0, 0, 0, 0);
        }
        return processFrame(tGFrame, this.config.getDesiredWidth().intValue(), (int) (this.config.getCompressRate(0) * 100.0f), rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] processFrame(com.alipay.zoloz.toyger.algorithm.TGFrame r10, int r11, int r12, android.graphics.Rect r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zlz.toyger.zdoc.DocBlobManagerJson.processFrame(com.alipay.zoloz.toyger.algorithm.TGFrame, int, int, android.graphics.Rect):byte[]");
    }

    public static Bitmap resize(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a6d680ee", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = i / width;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    private int getFrameMode(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3b065ee", new Object[]{this, tGFrame})).intValue();
        }
        int i = tGFrame.frameMode;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                return -1;
            }
        }
        return i2;
    }
}

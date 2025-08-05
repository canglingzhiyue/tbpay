package com.ap.zlz.toyger.zdoc;

import android.graphics.Rect;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.CryptoManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class b extends BlobManager<ToygerDocInfo> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INFO_DOC_TYPE = "docType";
    public static final String INFO_PAGE_NUMBER = "pageNo";
    public static final String INFO_PIC_SIZE = "picSize";
    public Rect mCropRect;
    public long picSize = 0;

    static {
        kge.a(1962720809);
    }

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract byte[] generateBlob(List<ToygerDocInfo> list, Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract boolean isUTF8();

    public long getPicSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcbeae70", new Object[]{this})).longValue() : this.picSize;
    }

    public void setBlobConfig(ToygerDocBlobConfig toygerDocBlobConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa23907", new Object[]{this, toygerDocBlobConfig});
            return;
        }
        this.config = toygerDocBlobConfig;
        if (this.crypto != null) {
            return;
        }
        this.crypto = new CryptoManager(toygerDocBlobConfig.pubkey, true);
    }

    public void setCropRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1a695c", new Object[]{this, rect});
            return;
        }
        int width = (int) ((rect.width() * 0.5f) / 2.0f);
        int height = (int) ((rect.height() * 0.5f) / 2.0f);
        this.mCropRect = new Rect(rect.left - width, rect.top - height, rect.right + width, rect.bottom + height);
    }

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("96e2cfad", new Object[]{this}) : this.crypto.getAESCypher();
    }

    public String getDocType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab09d81d", new Object[]{this}) : ((ToygerDocBlobConfig) this.config).docType;
    }

    public int getPageNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1cfa4a3b", new Object[]{this})).intValue() : ((ToygerDocBlobConfig) this.config).pageNo;
    }
}

package com.taobao.taobao.scancode.history.object;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ScanDo implements Serializable, IMTOPDataObject {
    private MaResult decodeResult;
    private String desc;
    private int icon;
    private String link;
    private Boolean newLogic;
    private Product product;
    private long time;
    private String title;
    private int image = 1;
    private int type = 2;
    private boolean networkAvailable = true;

    static {
        kge.a(222401254);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public boolean isNetworkAvailable() {
        return this.networkAvailable;
    }

    public void setNetworkAvailable(boolean z) {
        this.networkAvailable = z;
    }

    public Boolean isNewLogic() {
        return this.newLogic;
    }

    public void setNewLogic(Boolean bool) {
        this.newLogic = bool;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int i) {
        this.image = i;
    }

    public MaResult getDecodeResult() {
        return this.decodeResult;
    }

    public void setDecodeResult(MaResult maResult) {
        this.decodeResult = maResult;
    }

    public String getLocalizationTitle() {
        if (StringUtils.isEmpty(this.title)) {
            return "";
        }
        if (this.title.equals("淘宝网网址")) {
            return b.a(R.string.scancode_history_item_title_tb);
        }
        if (this.title.equals("天猫网网址")) {
            return b.a(R.string.scancode_history_item_title_tm);
        }
        if (this.title.equals("二维码内容")) {
            return b.a(R.string.scancode_history_item_title_qr);
        }
        if (this.title.equals("文本")) {
            return b.a(R.string.scancode_history_item_title_text);
        }
        if (this.title.equals("商品条形码")) {
            return b.a(R.string.scancode_history_item_title_product);
        }
        if (this.title.equals("药品条形码")) {
            return b.a(R.string.scancode_history_item_title_medicine);
        }
        if (this.title.equals("快递条形码")) {
            return b.a(R.string.scancode_history_item_title_express);
        }
        return this.title.equals("普通条形码") ? b.a(R.string.scancode_history_item_title_unknown_code) : "";
    }
}

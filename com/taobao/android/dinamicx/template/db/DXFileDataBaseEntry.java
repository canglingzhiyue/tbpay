package com.taobao.android.dinamicx.template.db;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.db.DXDataBaseEntry;
import tb.kge;

@DXDataBaseEntry.Table("template_info")
/* loaded from: classes.dex */
public class DXFileDataBaseEntry extends DXDataBaseEntry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DXDataBaseEntrySchema SCHEMA;
    @DXDataBaseEntry.Column(indexed = true, notNull = true, primaryKey = true, value = "biz_type")
    public String bizType;
    @DXDataBaseEntry.Column("extra_1")
    public String extra1;
    @DXDataBaseEntry.Column("extra_2")
    public String extra2;
    @DXDataBaseEntry.Column("extra_3")
    public String extra3;
    @DXDataBaseEntry.Column("extra_4")
    public String extra4;
    @DXDataBaseEntry.Column("extra_5")
    public String extra5;
    @DXDataBaseEntry.Column("extra_6")
    public String extra6;
    @DXDataBaseEntry.Column("extra_7")
    public String extra7;
    @DXDataBaseEntry.Column("extra_8")
    public String extra8;
    @DXDataBaseEntry.Column(notNull = true, value = "main_path")
    public String mainPath;
    @DXDataBaseEntry.Column(indexed = true, notNull = true, primaryKey = true, value = "name")
    public String name;
    @DXDataBaseEntry.Column("style_files")
    public String styleFiles;
    @DXDataBaseEntry.Column("url")
    public String url;
    @DXDataBaseEntry.Column(notNull = true, primaryKey = true, value = "version")
    public long version;

    static {
        kge.a(59260216);
        SCHEMA = new DXDataBaseEntrySchema(DXFileDataBaseEntry.class);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXFileDataBaseEntry{bizType='" + this.bizType + "', name='" + this.name + "', version=" + this.version + ", mainPath='" + this.mainPath + "', styleFiles='" + this.styleFiles + "', url='" + this.url + "', extra1='" + this.extra1 + "', extra2='" + this.extra2 + "', extra3='" + this.extra3 + "', extra4='" + this.extra4 + "', extra5='" + this.extra5 + "', extra6='" + this.extra6 + "', extra7='" + this.extra7 + "', extra8='" + this.extra8 + "'}";
    }
}

package com.android.taobao.safeclean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class AdditionList implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appVersion = "";
    public List<AdditionModel> additionDataList = new ArrayList();

    static {
        kge.a(284998272);
        kge.a(1028243835);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionList)) {
            return false;
        }
        return this.appVersion.equals(((CleanList) obj).appVersion) && collectionsEqual(this.additionDataList, ((AdditionList) obj).additionDataList);
    }

    private boolean collectionsEqual(List<AdditionModel> list, List<AdditionModel> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8fca38c", new Object[]{this, list, list2})).booleanValue();
        }
        if (list.size() == list2.size()) {
            return list.containsAll(list2);
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AdditionList{appVersion='" + this.appVersion + "', additionDataList=" + this.additionDataList + '}';
    }

    /* loaded from: classes3.dex */
    public static class AdditionModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String type = "internal";
        public String fileRoot = "";
        public String fileLocation = "";
        public String fileName = "";
        public boolean overrideExit = false;
        public String fileUrl = "";
        public String fileMD5 = "";
        public String fileSize = "";

        static {
            kge.a(713732681);
            kge.a(1028243835);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AdditionModel{type='" + this.type + "', fileRoot='" + this.fileRoot + "', fileLocation='" + this.fileLocation + "', fileName='" + this.fileName + "', overrideExit=" + this.overrideExit + ", fileUrl='" + this.fileUrl + "', fileMD5='" + this.fileMD5 + "', fileSize='" + this.fileSize + "'}";
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                AdditionModel additionModel = (AdditionModel) obj;
                String str = this.type;
                if (str == null ? additionModel.type != null : !str.equals(additionModel.type)) {
                    return false;
                }
                String str2 = this.fileRoot;
                if (str2 == null ? additionModel.fileRoot != null : !str2.equals(additionModel.fileRoot)) {
                    return false;
                }
                String str3 = this.fileLocation;
                if (str3 == null ? additionModel.fileLocation != null : !str3.equals(additionModel.fileLocation)) {
                    return false;
                }
                String str4 = this.fileUrl;
                if (str4 == null ? additionModel.fileUrl != null : !str4.equals(additionModel.fileUrl)) {
                    return false;
                }
                String str5 = this.fileMD5;
                if (str5 == null ? additionModel.fileMD5 != null : !str5.equals(additionModel.fileMD5)) {
                    return false;
                }
                String str6 = this.fileSize;
                if (str6 != null) {
                    return str6.equals(additionModel.fileSize);
                }
                if (additionModel.fileSize == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.type;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.fileRoot;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.fileLocation;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.fileUrl;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.fileMD5;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.fileSize;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode5 + i;
        }
    }
}

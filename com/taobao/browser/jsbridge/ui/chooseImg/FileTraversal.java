package com.taobao.browser.jsbridge.ui.chooseImg;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class FileTraversal implements Parcelable {
    public static final Parcelable.Creator<FileTraversal> CREATOR;
    public List<String> fileContent = new ArrayList();
    public String fileName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileName);
        parcel.writeList(this.fileContent);
    }

    static {
        kge.a(1686970375);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<FileTraversal>() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.FileTraversal.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public FileTraversal[] a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FileTraversal[]) ipChange.ipc$dispatch("d809aee8", new Object[]{this, new Integer(i)});
                }
                return null;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.browser.jsbridge.ui.chooseImg.FileTraversal] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FileTraversal createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.browser.jsbridge.ui.chooseImg.FileTraversal[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FileTraversal[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public FileTraversal a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FileTraversal) ipChange.ipc$dispatch("19813439", new Object[]{this, parcel});
                }
                FileTraversal fileTraversal = new FileTraversal();
                fileTraversal.fileName = parcel.readString();
                fileTraversal.fileContent = parcel.readArrayList(FileTraversal.class.getClassLoader());
                return fileTraversal;
            }
        };
    }
}

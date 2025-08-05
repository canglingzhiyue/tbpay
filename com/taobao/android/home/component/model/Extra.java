package com.taobao.android.home.component.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class Extra implements Externalizable, IMTOPDataObject {
    private static final long serialVersionUID = -4080061466928613765L;
    public String actionName;
    public String param;

    static {
        kge.a(-1303243941);
        kge.a(-350052935);
        kge.a(1946483474);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        if (objectInput.readBoolean()) {
            this.actionName = objectInput.readUTF();
        }
        if (objectInput.readBoolean()) {
            this.param = objectInput.readUTF();
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        boolean z = true;
        objectOutput.writeBoolean(this.actionName != null);
        String str = this.actionName;
        if (str != null) {
            objectOutput.writeUTF(str);
        }
        if (this.param == null) {
            z = false;
        }
        objectOutput.writeBoolean(z);
        String str2 = this.param;
        if (str2 != null) {
            objectOutput.writeUTF(str2);
        }
    }
}

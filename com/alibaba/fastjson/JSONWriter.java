package com.alibaba.fastjson;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import tb.kge;

/* loaded from: classes2.dex */
public class JSONWriter implements Closeable, Flushable {
    private JSONStreamContext context;
    private JSONSerializer serializer;
    private SerializeWriter writer;

    static {
        kge.a(1474847845);
        kge.a(-1811054506);
        kge.a(-1905625246);
    }

    public JSONWriter(Writer writer) {
        this.writer = new SerializeWriter(writer);
        this.serializer = new JSONSerializer(this.writer);
    }

    private void afterWriter() {
        int i;
        JSONStreamContext jSONStreamContext = this.context;
        if (jSONStreamContext == null) {
            return;
        }
        switch (jSONStreamContext.state) {
            case 1001:
            case 1003:
                i = 1002;
                break;
            case 1002:
                i = 1003;
                break;
            case 1004:
                i = 1005;
                break;
            default:
                i = -1;
                break;
        }
        if (i == -1) {
            return;
        }
        this.context.state = i;
    }

    private void beforeWrite() {
        SerializeWriter serializeWriter;
        JSONStreamContext jSONStreamContext = this.context;
        if (jSONStreamContext == null) {
            return;
        }
        int i = 44;
        switch (jSONStreamContext.state) {
            case 1001:
            case 1004:
            default:
                return;
            case 1002:
                serializeWriter = this.writer;
                i = 58;
                break;
            case 1003:
                serializeWriter = this.writer;
                break;
            case 1005:
                this.writer.write(44);
                return;
        }
        serializeWriter.write(i);
    }

    private void beginStructure() {
        SerializeWriter serializeWriter;
        int i;
        int i2 = this.context.state;
        switch (this.context.state) {
            case 1001:
                return;
            case 1002:
                serializeWriter = this.writer;
                i = 58;
                break;
            case 1003:
            default:
                throw new JSONException("illegal state : " + i2);
            case 1004:
                return;
            case 1005:
                serializeWriter = this.writer;
                i = 44;
                break;
        }
        serializeWriter.write(i);
    }

    private void endStructure() {
        int i;
        this.context = this.context.parent;
        JSONStreamContext jSONStreamContext = this.context;
        if (jSONStreamContext == null) {
            return;
        }
        switch (jSONStreamContext.state) {
            case 1001:
                i = 1002;
                break;
            case 1002:
                i = 1003;
                break;
            case 1003:
            case 1005:
            default:
                i = -1;
                break;
            case 1004:
                i = 1005;
                break;
        }
        if (i == -1) {
            return;
        }
        this.context.state = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.writer.close();
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
        this.writer.config(serializerFeature, z);
    }

    public void endArray() {
        this.writer.write(93);
        endStructure();
    }

    public void endObject() {
        this.writer.write(125);
        endStructure();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.writer.flush();
    }

    public void startArray() {
        if (this.context != null) {
            beginStructure();
        }
        this.context = new JSONStreamContext(this.context, 1004);
        this.writer.write(91);
    }

    public void startObject() {
        if (this.context != null) {
            beginStructure();
        }
        this.context = new JSONStreamContext(this.context, 1001);
        this.writer.write(123);
    }

    public void writeKey(String str) {
        writeObject(str);
    }

    public void writeObject(Object obj) {
        beforeWrite();
        this.serializer.write(obj);
        afterWriter();
    }

    public void writeObject(String str) {
        beforeWrite();
        this.serializer.write(str);
        afterWriter();
    }

    public void writeValue(Object obj) {
        writeObject(obj);
    }
}

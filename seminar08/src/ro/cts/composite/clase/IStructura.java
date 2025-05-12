package ro.cts.composite.clase;

public interface IStructura {
    void descrieStructura();
    void adaugaNod(IStructura structura) throws Exception;
    void stergeNod(IStructura structura) throws Exception;
    IStructura getCopilNod(int index) throws Exception;
}

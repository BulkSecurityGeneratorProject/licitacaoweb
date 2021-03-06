package br.edu.ifg.fsa.tads.licitacaoweb.service.dto;

import br.edu.ifg.fsa.tads.licitacaoweb.domain.TbMaterial;
import br.edu.ifg.fsa.tads.licitacaoweb.domain.TbServico;
import br.edu.ifg.fsa.tads.licitacaoweb.service.util.BaseVO;

import java.util.ArrayList;
import java.util.List;

public class ServicoDTO implements BaseVO<ServicoDTO,TbServico> {
    Long id;
    Long codigo;
    String descricao;
    Integer page;
    Integer count;
    String campo;
    String ordem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    @Override
    public List<ServicoDTO> toList(List<TbServico> entidades) {
        List<ServicoDTO> vos = new ArrayList<>();
        for (TbServico i : entidades) {
            vos.add(toVO(i));
        }
        return vos;
    }

    @Override
    public ServicoDTO toVO(TbServico servico) {
        ServicoDTO servicoDTO = new ServicoDTO();
        servicoDTO.setId(servico.getId());
        servicoDTO.setDescricao(servico.getDescricao());
        servicoDTO.setCodigo(servico.getCodigo());
        return servicoDTO;
    }
}

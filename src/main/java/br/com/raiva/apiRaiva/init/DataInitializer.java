package br.com.raiva.apiRaiva.init;

import br.com.raiva.apiRaiva.model.Usuario;
import br.com.raiva.apiRaiva.model.Endereco;
import br.com.raiva.apiRaiva.model.UnidadeSaude;
import br.com.raiva.apiRaiva.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import br.com.raiva.apiRaiva.repository.EnderecoRepository;
import br.com.raiva.apiRaiva.repository.UnidadeSaudeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

        private final UsuarioRepository usuarioRepository;
        private final EnderecoRepository enderecoRepository;
        private final UnidadeSaudeRepository unidadeSaudeRepository;

        @Override
        public void run(String... args) throws Exception {
                Endereco endereco1 = new Endereco("Cidade1", "Bairro1", "Rua1", 12L, 123L, "Complemento1");
                endereco1 = enderecoRepository.save(endereco1);

                Endereco endereco2 = new Endereco("Cidade2", "Bairro2", "Rua2", 34L, 456L, "Complemento2");
                endereco2 = enderecoRepository.save(endereco2);

                Endereco endereco3 = new Endereco("Cidade3", "Bairro3", "Rua3", 56L, 789L, "Complemento3");
                endereco3 = enderecoRepository.save(endereco3);

                Endereco endereco4 = new Endereco("Cidade4", "Bairro4", "Rua4", 78L, 101112L, "Complemento4");
                endereco4 = enderecoRepository.save(endereco4);

                Usuario usuario1 = new Usuario("Master", LocalDate.now(), endereco1, "telefone1", 1L, true);
                usuarioRepository.save(usuario1);

                Usuario usuario2 = new Usuario("Izanf", LocalDate.now(), endereco2, "telefone2", 2L, true);
                usuarioRepository.save(usuario2);

                Usuario usuario3 = new Usuario("Sâmú", LocalDate.now(), endereco3, "telefone3", 3L, true);
                usuarioRepository.save(usuario3);

                Usuario usuario4 = new Usuario("Jozz", LocalDate.now(), endereco4, "telefone4", 4L, true);
                usuarioRepository.save(usuario4);

                ///////////////////////////////////////////////////////////////////////

                // Distrito Norte I - USF REDINHA
                Endereco enderecoRedinha = new Endereco("Rua do Campo", null, "Redinha");
                enderecoRepository.save(enderecoRedinha);

                UnidadeSaude usfRedinha = new UnidadeSaude("Distrito Norte I", "USF REDINHA", enderecoRedinha,
                                Arrays.asList("3232-8185", "3232-8186"));
                unidadeSaudeRepository.save(usfRedinha);

                // Distrito Norte I - USF ÁFRICA
                Endereco enderecoAfrica = new Endereco("Av. Dr. João Medeiros Filho", null, "Redinha");
                enderecoRepository.save(enderecoAfrica);

                UnidadeSaude usfAfrica = new UnidadeSaude("Distrito Norte I", "USF ÁFRICA", enderecoAfrica,
                                Collections.singletonList("3232-8191"));
                unidadeSaudeRepository.save(usfAfrica);

                // Distrito Norte I - USF PARQUE DAS DUNAS
                Endereco enderecoParqueDasDunas = new Endereco("Av. Mar Mediterrâneo", 101L,
                                "Conjunto Parque das Dunas - Pajuçara");
                enderecoRepository.save(enderecoParqueDasDunas);

                UnidadeSaude usfParqueDasDunas = new UnidadeSaude("Distrito Norte I", "USF PARQUE DAS DUNAS",
                                enderecoParqueDasDunas, Collections.singletonList("3232-4847"));
                unidadeSaudeRepository.save(usfParqueDasDunas);

                // Distrito Norte I - USF VISTA VERDE
                Endereco enderecoVistaVerde = new Endereco("Rua Linda Batista", null, "Vista Verde - Pajuçara");
                enderecoRepository.save(enderecoVistaVerde);

                UnidadeSaude usfVistaVerde = new UnidadeSaude("Distrito Norte I", "USF VISTA VERDE", enderecoVistaVerde,
                                Collections.singletonList("3232-8270"));
                unidadeSaudeRepository.save(usfVistaVerde);

                // Distrito Norte I - USF POMPÉIA
                Endereco enderecoPompeia = new Endereco("Rua Oceano Atlântico", 172L, "Nova República - Pajuçara");
                enderecoRepository.save(enderecoPompeia);

                UnidadeSaude usfPompeia = new UnidadeSaude("Distrito Norte I", "USF POMPÉIA", enderecoPompeia,
                                Collections.singletonList("3232-8184"));
                unidadeSaudeRepository.save(usfPompeia);

                // Distrito Norte I - USF GRAMORÉ
                Endereco enderecoGramore = new Endereco("Av. Guaratinguetá", null, "Lagoa Azul");
                enderecoRepository.save(enderecoGramore);

                UnidadeSaude usfGramore = new UnidadeSaude("Distrito Norte I", "USF GRAMORÉ", enderecoGramore,
                                Arrays.asList("3232-8245", "3232-8246"));
                unidadeSaudeRepository.save(usfGramore);

                // Distrito Norte I - USF NOVA NATAL
                Endereco enderecoNovaNatal = new Endereco("Rua do Pastoril", null, "Nova Natal - Lagoa Azul");
                enderecoRepository.save(enderecoNovaNatal);

                UnidadeSaude usfNovaNatal = new UnidadeSaude("Distrito Norte I", "USF NOVA NATAL", enderecoNovaNatal,
                                Arrays.asList("3232-8203", "3232-9237"));
                unidadeSaudeRepository.save(usfNovaNatal);

                // Distrito Norte I - USF NORDELÂNDIA
                Endereco enderecoNordelandia = new Endereco("Rua José de França da Silva", null,
                                "Loteamento Nordelândia - Lagoa Azul");
                enderecoRepository.save(enderecoNordelandia);

                UnidadeSaude usfNordelandia = new UnidadeSaude("Distrito Norte I", "USF NORDELÂNDIA",
                                enderecoNordelandia,
                                Collections.singletonList("3232-9234"));
                unidadeSaudeRepository.save(usfNordelandia);

                // Distrito Norte I - USF CIDADE PRAIA
                Endereco enderecoCidadePraia = new Endereco("Rua São Caetano", 520L, "Cidade Praia - Lagoa Azul");
                enderecoRepository.save(enderecoCidadePraia);

                UnidadeSaude usfCidadePraia = new UnidadeSaude("Distrito Norte I", "USF CIDADE PRAIA",
                                enderecoCidadePraia,
                                Collections.singletonList("3232-9232"));
                unidadeSaudeRepository.save(usfCidadePraia);

                // Distrito Norte I - USF JOSÉ SARNEY
                Endereco enderecoJoseSarney = new Endereco("Rua dos Lírios", 231L,
                                "Loteamento José Sarney - Lagoa Azul");
                enderecoRepository.save(enderecoJoseSarney);

                UnidadeSaude usfJoseSarney = new UnidadeSaude("Distrito Norte I", "USF JOSÉ SARNEY", enderecoJoseSarney,
                                Collections.singletonList("3232-9236"));
                unidadeSaudeRepository.save(usfJoseSarney);

                // Distrito Norte I - USF PAJUÇARA
                Endereco enderecoPajucara = new Endereco("Rua Maracaí", null, "Pajuçara");
                enderecoRepository.save(enderecoPajucara);

                UnidadeSaude usfPajucara = new UnidadeSaude("Distrito Norte I", "USF PAJUÇARA", enderecoPajucara,
                                Arrays.asList("3232-8240", "3232-8241", "3232-8242"));
                unidadeSaudeRepository.save(usfPajucara);

                // Distrito Norte I - UPA PAJUÇARA
                Endereco enderecoUpaPajucara = new Endereco("Av. Moema Tinoco da Cunha Lima", 3393L, "Pajuçara");
                enderecoRepository.save(enderecoUpaPajucara);

                UnidadeSaude upaPajucara = new UnidadeSaude("Distrito Norte I", "UPA PAJUÇARA", enderecoUpaPajucara,
                                Arrays.asList("3614-5180", "3232-4873", "3232-3877"));
                unidadeSaudeRepository.save(upaPajucara);

                // Distrito Norte II - UBS BELA VISTA
                Endereco enderecoBelaVista = new Endereco("Travessa Bela Vista", 2L, "Igapó");
                enderecoRepository.save(enderecoBelaVista);

                UnidadeSaude ubsBelaVista = new UnidadeSaude("Distrito Norte II", "UBS BELA VISTA", enderecoBelaVista,
                                Collections.singletonList("3232-5653"));
                unidadeSaudeRepository.save(ubsBelaVista);

                // Distrito Norte II - USF IGAPÓ
                Endereco enderecoIgapo = new Endereco("Rua Santiago", null, "Igapó");
                enderecoRepository.save(enderecoIgapo);

                UnidadeSaude usfIgapo = new UnidadeSaude("Distrito Norte II", "USF IGAPÓ", enderecoIgapo,
                                Collections.singletonList("3232-8267"));
                unidadeSaudeRepository.save(usfIgapo);

                // Distrito Norte II - USF PANATIS
                Endereco enderecoPanatis = new Endereco("Rua Milton Servilha Brito", 994L,
                                "Conjunto Panatis - Potengi");
                enderecoRepository.save(enderecoPanatis);

                UnidadeSaude usfPanatis = new UnidadeSaude("Distrito Norte II", "USF PANATIS", enderecoPanatis,
                                Collections.singletonList("3232-8220"));
                unidadeSaudeRepository.save(usfPanatis);

                // Distrito Norte II - USF POTENGI
                Endereco enderecoPotengi = new Endereco("Rua Itapetinga", 2L, "Conjunto Santarém - Potengi");
                enderecoRepository.save(enderecoPotengi);

                UnidadeSaude usfPotengi = new UnidadeSaude("Distrito Norte II", "USF POTENGI", enderecoPotengi,
                                Collections.singletonList("3232-8205"));
                unidadeSaudeRepository.save(usfPotengi);

                // Distrito Norte II - USF SANTARÉM
                Endereco enderecoSantarem = new Endereco("Av. Rio Doce", 12L, "Conjunto Potengi - Potengi");
                enderecoRepository.save(enderecoSantarem);

                UnidadeSaude usfSantarem = new UnidadeSaude("Distrito Norte II", "USF SANTARÉM", enderecoSantarem,
                                Arrays.asList("3232-8215", "3232-8216"));
                unidadeSaudeRepository.save(usfSantarem);

                // Distrito Norte II - UBS NOVA ALIANÇA
                Endereco enderecoNovaAlianca = new Endereco("Rua Nova Granada", null, "Nossa Senhora da Apresentação");
                enderecoRepository.save(enderecoNovaAlianca);

                UnidadeSaude ubsNovaAlianca = new UnidadeSaude("Distrito Norte II", "UBS NOVA ALIANÇA",
                                enderecoNovaAlianca,
                                Collections.singletonList("3232-4848"));
                unidadeSaudeRepository.save(ubsNovaAlianca);

                // Distrito Norte II - USF PARQUE DOS COQUEIROS
                Endereco enderecoParqueDosCoqueiros = new Endereco("Rua das Pedrinhas", null,
                                "Nossa Senhora da Apresentação");
                enderecoRepository.save(enderecoParqueDosCoqueiros);

                UnidadeSaude usfParqueDosCoqueiros = new UnidadeSaude("Distrito Norte II", "USF PARQUE DOS COQUEIROS",
                                enderecoParqueDosCoqueiros, Collections.singletonList("3232-8183"));
                unidadeSaudeRepository.save(usfParqueDosCoqueiros);

                // Distrito Norte II - UBS PEDRA DO SINO
                Endereco enderecoPedraDoSino = new Endereco("Rua Pedra do Sino", 1029L,
                                "Conjunto Soledade I - Potengi");
                enderecoRepository.save(enderecoPedraDoSino);

                UnidadeSaude ubsPedraDoSino = new UnidadeSaude("Distrito Norte II", "UBS PEDRA DO SINO",
                                enderecoPedraDoSino,
                                Collections.singletonList("3232-9233"));
                unidadeSaudeRepository.save(ubsPedraDoSino);

                // Distrito Norte II - USF SOLEDADE II
                Endereco enderecoSoledadeII = new Endereco("Rua Serra Negra", null, "Conjunto Soledade II - Potengi");
                enderecoRepository.save(enderecoSoledadeII);

                UnidadeSaude usfSoledadeII = new UnidadeSaude("Distrito Norte II", "USF SOLEDADE II",
                                enderecoSoledadeII,
                                Collections.singletonList("3232-8210"));
                unidadeSaudeRepository.save(usfSoledadeII);

                // Distrito Norte II - UBS JARDIM PROGRESSO
                Endereco enderecoJardimProgresso = new Endereco("Rua Antonia Santana", null,
                                "Loteamento Jardim Progresso - Nossa Senhora da Apresentação");
                enderecoRepository.save(enderecoJardimProgresso);

                UnidadeSaude ubsJardimProgresso = new UnidadeSaude("Distrito Norte II", "UBS JARDIM PROGRESSO",
                                enderecoJardimProgresso, Collections.singletonList("3232-5614"));
                unidadeSaudeRepository.save(ubsJardimProgresso);

                // Distrito Norte II - USF VALE DOURADO
                Endereco enderecoValeDourado = new Endereco("Rua Irmã Vitória", 2L, "Nossa Senhora da Apresentação");
                enderecoRepository.save(enderecoValeDourado);

                UnidadeSaude usfValeDourado = new UnidadeSaude("Distrito Norte II", "USF VALE DOURADO",
                                enderecoValeDourado,
                                Arrays.asList("3232-8260", "3232-8261"));
                unidadeSaudeRepository.save(usfValeDourado);

                // Distrito Norte II - UPA POTENGI
                Endereco enderecoUpaPotengi = new Endereco("Av. Senhor do Bonfim", null,
                                "Conjunto Santa Catarina - Potengi");
                enderecoRepository.save(enderecoUpaPotengi);

                UnidadeSaude upaPotengi = new UnidadeSaude("Distrito Norte II", "UPA POTENGI", enderecoUpaPotengi,
                                Arrays.asList("3232-4450", "3232-4451"));
                unidadeSaudeRepository.save(upaPotengi);

                // Distrito Leste - UBS SÃO JOÃO
                Endereco enderecoSaoJoao = new Endereco("Av. Romualdo Galvão", 891L, "Tirol");
                enderecoRepository.save(enderecoSaoJoao);

                UnidadeSaude ubsSaoJoao = new UnidadeSaude("Distrito Leste", "UBS SÃO JOÃO", enderecoSaoJoao,
                                Arrays.asList("3232-8570", "3232-8573"));
                unidadeSaudeRepository.save(ubsSaoJoao);

                // Distrito Leste - UBS ALECRIM
                Endereco enderecoAlecrim = new Endereco("Rua Fonseca e Silva", 1129L, "Alecrim");
                enderecoRepository.save(enderecoAlecrim);

                UnidadeSaude ubsAlecrim = new UnidadeSaude("Distrito Leste", "UBS ALECRIM", enderecoAlecrim,
                                Collections.singletonList("3232-8427"));
                unidadeSaudeRepository.save(ubsAlecrim);

                // Distrito Leste - UBS LAGOA SECA
                Endereco enderecoLagoaSeca = new Endereco("Rua Padre Antônio", null, "Lagoa Seca");
                enderecoRepository.save(enderecoLagoaSeca);

                UnidadeSaude ubsLagoaSeca = new UnidadeSaude("Distrito Leste", "UBS LAGOA SECA", enderecoLagoaSeca,
                                Arrays.asList("3232-8475", "3232-8476"));
                unidadeSaudeRepository.save(ubsLagoaSeca);
                // Distrito Leste - USF APARECIDA
                Endereco enderecoAparecida = new Endereco("Rua Guanabara", 195L, "Mãe Luíza");
                enderecoRepository.save(enderecoAparecida);

                UnidadeSaude usfAparecida = new UnidadeSaude("Distrito Leste", "USF APARECIDA", enderecoAparecida,
                                Collections.singletonList("3232-8620"));
                unidadeSaudeRepository.save(usfAparecida);

                // Distrito Leste - USF BRASÍLIA TEIMOSA
                Endereco enderecoBrasiliaTeimosa = new Endereco("Rua Miramar", null, "Praia do Meio");
                enderecoRepository.save(enderecoBrasiliaTeimosa);

                UnidadeSaude usfBrasiliaTeimosa = new UnidadeSaude("Distrito Leste", "USF BRASÍLIA TEIMOSA",
                                enderecoBrasiliaTeimosa, Collections.singletonList("3232-8536"));
                unidadeSaudeRepository.save(usfBrasiliaTeimosa);

                // Distrito Leste - USF PASSO DA PÁTRIA
                Endereco enderecoPassoDaPatria = new Endereco("Travessa Ocidental de Baixo", 27L, "Alecrim");
                enderecoRepository.save(enderecoPassoDaPatria);

                UnidadeSaude usfPassoDaPatria = new UnidadeSaude("Distrito Leste", "USF PASSO DA PÁTRIA",
                                enderecoPassoDaPatria,
                                Collections.singletonList("3232-8560"));
                unidadeSaudeRepository.save(usfPassoDaPatria);

                // Distrito Leste - USF GUARITA
                Endereco enderecoGuarita = new Endereco("Rua Fonseca e Silva", 1129L, "Alecrim");
                enderecoRepository.save(enderecoGuarita);

                UnidadeSaude usfGuarita = new UnidadeSaude("Distrito Leste", "USF GUARITA", enderecoGuarita,
                                Collections.singletonList("3232-8438"));
                unidadeSaudeRepository.save(usfGuarita);

                // Distrito Leste - USF ROCAS
                Endereco enderecoRocas = new Endereco("Rua Francisco Bicalho", null, "Rocas");
                enderecoRepository.save(enderecoRocas);

                UnidadeSaude usfRocas = new UnidadeSaude("Distrito Leste", "USF ROCAS", enderecoRocas,
                                Collections.singletonList("3232-8820"));
                unidadeSaudeRepository.save(usfRocas);

                // Distrito Oeste - USF BAIRRO NORDESTE
                Endereco enderecoBairroNordeste = new Endereco("Rua Alto da Bela Vista", 492L, "Bairro Nordeste");
                enderecoRepository.save(enderecoBairroNordeste);

                UnidadeSaude usfBairroNordeste = new UnidadeSaude("Distrito Oeste", "USF BAIRRO NORDESTE",
                                enderecoBairroNordeste, Collections.singletonList("3232-8450"));
                unidadeSaudeRepository.save(usfBairroNordeste);

                // Distrito Oeste - USF BOM PASTOR
                Endereco enderecoBomPastor = new Endereco("Rua Augusto Calheiros", 01L, "Bom Pastor");
                enderecoRepository.save(enderecoBomPastor);

                UnidadeSaude usfBomPastor = new UnidadeSaude("Distrito Oeste", "USF BOM PASTOR", enderecoBomPastor,
                                Collections.singletonList("3232-8455"));
                unidadeSaudeRepository.save(usfBomPastor);

                // Distrito Oeste - USF CIDADE NOVA
                Endereco enderecoCidadeNova = new Endereco("Rua Laranjal", 483L, "Cidade Nova");
                enderecoRepository.save(enderecoCidadeNova);

                UnidadeSaude usfCidadeNova = new UnidadeSaude("Distrito Oeste", "USF CIDADE NOVA", enderecoCidadeNova,
                                Collections.singletonList("3232-8330"));
                unidadeSaudeRepository.save(usfCidadeNova);

                // Distrito Oeste - USF FELIPE CAMARÃO I
                Endereco enderecoFelipeCamaraoI = new Endereco("Rua da Tamarineira", 25L, "Felipe Camarão");
                enderecoRepository.save(enderecoFelipeCamaraoI);

                UnidadeSaude usfFelipeCamaraoI = new UnidadeSaude("Distrito Oeste", "USF FELIPE CAMARÃO I",
                                enderecoFelipeCamaraoI, Arrays.asList("3232-8320", "3232-8321", "3232-8323"));
                unidadeSaudeRepository.save(usfFelipeCamaraoI);

                // Distrito Oeste - USF FELIPE CAMARÃO II (Primeiro Endereço)
                Endereco enderecoFelipeCamaraoII1 = new Endereco("Rua Santa Cristina", 882L, "Felipe Camarão");
                enderecoRepository.save(enderecoFelipeCamaraoII1);

                UnidadeSaude usfFelipeCamaraoII1 = new UnidadeSaude("Distrito Oeste", "USF FELIPE CAMARÃO II",
                                enderecoFelipeCamaraoII1, Collections.singletonList("3232-8315"));
                unidadeSaudeRepository.save(usfFelipeCamaraoII1);

                // Distrito Oeste - USF FELIPE CAMARÃO II (Segundo Endereço)
                Endereco enderecoFelipeCamaraoII2 = new Endereco("Rua Itamar Maciel", 360L, "Felipe Camarão");
                enderecoRepository.save(enderecoFelipeCamaraoII2);

                UnidadeSaude usfFelipeCamaraoII2 = new UnidadeSaude("Distrito Oeste", "USF FELIPE CAMARÃO II",
                                enderecoFelipeCamaraoII2, Collections.singletonList("3232-4997"));
                unidadeSaudeRepository.save(usfFelipeCamaraoII2);

                // Distrito Oeste - USF QUINTAS
                Endereco enderecoQuintas = new Endereco("Travessa Luiz Sampaio", 712L, "Quintas");
                enderecoRepository.save(enderecoQuintas);

                UnidadeSaude usfQuintas = new UnidadeSaude("Distrito Oeste", "USF QUINTAS", enderecoQuintas,
                                Collections.singletonList("3232-8435"));
                unidadeSaudeRepository.save(usfQuintas);
                // Distrito Oeste - USF QUINTAS (novo endereço)
                Endereco enderecoQuintasNovo = new Endereco("Rua dos Paiatis", 1854L, "Quintas");
                enderecoRepository.save(enderecoQuintasNovo);

                UnidadeSaude usfQuintasNovo = new UnidadeSaude("Distrito Oeste", "USF QUINTAS", enderecoQuintasNovo,
                                Arrays.asList("3232-8327", "3232-8446"));
                unidadeSaudeRepository.save(usfQuintasNovo);

                // Distrito Oeste - USF MONTE LÍBANO
                Endereco enderecoMonteLibano = new Endereco("Rua Matusalém", 191L, "Bom Pastor");
                enderecoRepository.save(enderecoMonteLibano);

                UnidadeSaude usfMonteLibano = new UnidadeSaude("Distrito Oeste", "USF MONTE LÍBANO",
                                enderecoMonteLibano,
                                Arrays.asList("3232-8440", "3232-8441"));
                unidadeSaudeRepository.save(usfMonteLibano);

                // Distrito Oeste - USF NAZARÉ
                Endereco enderecoNazare = new Endereco("Rua Rubens Mariz", 744L, "Nossa Sra de Nazaré");
                enderecoRepository.save(enderecoNazare);

                UnidadeSaude usfNazare = new UnidadeSaude("Distrito Oeste", "USF NAZARÉ", enderecoNazare,
                                Collections.singletonList("3232-8350"));
                unidadeSaudeRepository.save(usfNazare);

                // Distrito Oeste - USF NOVA CIDADE
                Endereco enderecoNovaCidade = new Endereco("Rua Francisco de Assis Martins", null, "Nova Cidade");
                enderecoRepository.save(enderecoNovaCidade);

                UnidadeSaude usfNovaCidade = new UnidadeSaude("Distrito Oeste", "USF NOVA CIDADE", enderecoNovaCidade,
                                Collections.singletonList("3232-8325"));
                unidadeSaudeRepository.save(usfNovaCidade);

                // Distrito Oeste - USF KM 06
                Endereco enderecoKm06 = new Endereco("Avenida Capitão Mor Gouveia", 10318L, "KM-06");
                enderecoRepository.save(enderecoKm06);

                UnidadeSaude usfKm06 = new UnidadeSaude("Distrito Oeste", "USF KM 06", enderecoKm06,
                                Collections.singletonList("3232-8310"));
                unidadeSaudeRepository.save(usfKm06);

                // Distrito Oeste - USF NOVO HORIZONTE
                Endereco enderecoNovoHorizonte = new Endereco("Rua dos Paiatis", 128L, "Bom Pastor");
                enderecoRepository.save(enderecoNovoHorizonte);

                UnidadeSaude usfNovoHorizonte = new UnidadeSaude("Distrito Oeste", "USF NOVO HORIZONTE",
                                enderecoNovoHorizonte,
                                Collections.singletonList("3232-8445"));
                unidadeSaudeRepository.save(usfNovoHorizonte);

                // Distrito Oeste - USF GUARAPES
                Endereco enderecoGuarapes = new Endereco("Rua Lagoa Seca", 74L, "Guarapes");
                enderecoRepository.save(enderecoGuarapes);

                UnidadeSaude usfGuarapes = new UnidadeSaude("Distrito Oeste", "USF GUARAPES", enderecoGuarapes,
                                Collections.singletonList("3232-8406"));
                unidadeSaudeRepository.save(usfGuarapes);

                // Distrito Oeste - UBS ESPERANÇA
                Endereco enderecoEsperanca = new Endereco("Av. Pernambuco", 214L, "Cidade da Esperança");
                enderecoRepository.save(enderecoEsperanca);

                UnidadeSaude ubsEsperanca = new UnidadeSaude("Distrito Oeste", "UBS ESPERANÇA", enderecoEsperanca,
                                Collections.singletonList("3232-5628"));
                unidadeSaudeRepository.save(ubsEsperanca);

                // Distrito Oeste - UPA ESPERANÇA
                Endereco enderecoUpaEsperanca = new Endereco("Av. Paraíba", 214L, "Cidade da Esperança");
                enderecoRepository.save(enderecoUpaEsperanca);

                UnidadeSaude upaEsperanca = new UnidadeSaude("Distrito Oeste", "UPA ESPERANÇA", enderecoUpaEsperanca,
                                Arrays.asList("3232-2369", "3232-2378"));
                unidadeSaudeRepository.save(upaEsperanca);

                // Distrito Sul - UBS CANDELÁRIA
                Endereco enderecoCandelaria = new Endereco("Rua Barão de Açu", null, "Candelária");
                enderecoRepository.save(enderecoCandelaria);

                UnidadeSaude ubsCandelaria = new UnidadeSaude("Distrito Sul", "UBS CANDELÁRIA", enderecoCandelaria,
                                Collections.singletonList("3232-8295"));
                unidadeSaudeRepository.save(ubsCandelaria);

                // Distrito Sul - USF RONALDO MACHADO
                Endereco enderecoRonaldoMachado = new Endereco("Rua Desportista Arthur Veiga", 145L, "Planalto");
                enderecoRepository.save(enderecoRonaldoMachado);

                UnidadeSaude usfRonaldoMachado = new UnidadeSaude("Distrito Sul", "USF RONALDO MACHADO",
                                enderecoRonaldoMachado,
                                Collections.singletonList("3218-0110"));
                unidadeSaudeRepository.save(usfRonaldoMachado);

                // Distrito Sul - UBS SATÉLITE
                Endereco enderecoSatelite = new Endereco("Rua das Carnaúbas", 02L, "Pitimbu");
                enderecoRepository.save(enderecoSatelite);

                UnidadeSaude ubsSatelite = new UnidadeSaude("Distrito Sul", "UBS SATÉLITE", enderecoSatelite,
                                Collections.singletonList("3232-8390"));
                unidadeSaudeRepository.save(ubsSatelite);

                // Distrito Sul - UBS ROSÂNGELA LIMA
                Endereco enderecoRosangelaLima = new Endereco("Rua Santa Beatriz", 11L, "Planalto");
                enderecoRepository.save(enderecoRosangelaLima);

                UnidadeSaude ubsRosangelaLima = new UnidadeSaude("Distrito Sul", "UBS ROSÂNGELA LIMA",
                                enderecoRosangelaLima,
                                Collections.singletonList("3232-2246"));
                unidadeSaudeRepository.save(ubsRosangelaLima);

                // Distrito Sul - UBS NOVA DESCOBERTA
                Endereco enderecoNovaDescoberta = new Endereco("Av. Xavier da Silveira", 1526L, "Nova Descoberta");
                enderecoRepository.save(enderecoNovaDescoberta);

                UnidadeSaude ubsNovaDescoberta = new UnidadeSaude("Distrito Sul", "UBS NOVA DESCOBERTA",
                                enderecoNovaDescoberta,
                                Collections.singletonList("3232-8282"));
                unidadeSaudeRepository.save(ubsNovaDescoberta);

                // Distrito Sul - UBS PIRANGI
                Endereco enderecoPirangi = new Endereco("Av. São Miguel dos Caribes", 4650L, "Conjunto Pirangi");
                enderecoRepository.save(enderecoPirangi);

                UnidadeSaude ubsPirangi = new UnidadeSaude("Distrito Sul", "UBS PIRANGI", enderecoPirangi,
                                Collections.singletonList("3232-8380"));
                unidadeSaudeRepository.save(ubsPirangi);

                // Distrito Sul - UBS JIQUI
                Endereco enderecoJiqui = new Endereco("Rua União dos Palmares", 11L, "Jiqui");
                enderecoRepository.save(enderecoJiqui);

                UnidadeSaude ubsJiqui = new UnidadeSaude("Distrito Sul", "UBS JIQUI", enderecoJiqui,
                                Collections.singletonList("3232-8385"));
                unidadeSaudeRepository.save(ubsJiqui);

                // Distrito Sul - UBS PITIMBU
                Endereco enderecoPitimbu = new Endereco("Rua Serra do Piracambu", 02L, "Pitimbu");
                enderecoRepository.save(enderecoPitimbu);

                UnidadeSaude ubsPitimbu = new UnidadeSaude("Distrito Sul", "UBS PITIMBU", enderecoPitimbu,
                                Collections.singletonList("3232-8395"));
                unidadeSaudeRepository.save(ubsPitimbu);

                // Distrito Sul - USF PLANALTO
                Endereco enderecoPlanalto = new Endereco("Rua Comunidade Shalom", 15L, "Planalto");
                enderecoRepository.save(enderecoPlanalto);

                UnidadeSaude usfPlanalto = new UnidadeSaude("Distrito Sul", "USF PLANALTO", enderecoPlanalto,
                                Collections.singletonList("3232-8400"));
                unidadeSaudeRepository.save(usfPlanalto);

                // Distrito Sul - USF PONTA NEGRA
                Endereco enderecoPontaNegra = new Endereco("Rua José Medeiros", 01L, "Ponta Negra");
                enderecoRepository.save(enderecoPontaNegra);

                UnidadeSaude usfPontaNegra = new UnidadeSaude("Distrito Sul", "USF PONTA NEGRA", enderecoPontaNegra,
                                Collections.singletonList("3232-8410"));
                unidadeSaudeRepository.save(usfPontaNegra);

                // Distrito Sul - UBS MIRASSOL
                Endereco enderecoMirassol = new Endereco("Rua das Orquídeas", 779L, "Conjunto Mirassol");
                enderecoRepository.save(enderecoMirassol);

                UnidadeSaude ubsMirassol = new UnidadeSaude("Distrito Sul", "UBS MIRASSOL", enderecoMirassol,
                                Arrays.asList("3232-8290", "3232-8292"));
                unidadeSaudeRepository.save(ubsMirassol);

                // Distrito Sul - UPA SUL
                Endereco enderecoUPASul = new Endereco("Av. dos Xavantes", 1228L, "Pitimbu - Cidade Satélite");
                enderecoRepository.save(enderecoUPASul);

                UnidadeSaude upaSul = new UnidadeSaude("Distrito Sul", "UPA SUL", enderecoUPASul,
                                Collections.singletonList("3232-9827"));
                unidadeSaudeRepository.save(upaSul);

        }

}
window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.FiltrosHistoricoprecos = window.blockly.js.blockly.FiltrosHistoricoprecos
		|| {};

/**
 * Filtros_historicoPrecos
 */
window.blockly.js.blockly.FiltrosHistoricoprecos.esconder_filtros = function() {
	this.cronapi.screen.hideComponent("crn-datasource-filter-general");
	this.cronapi.screen.hideComponent("filtro-dataini");
	this.cronapi.screen.hideComponent("filtro-datafim");
	this.cronapi.screen.hideComponent("filtro-precomin");
	this.cronapi.screen.hideComponent("filtro-precomax");
	this.cronapi.screen.hideComponent("botao-busca");
	this.cronapi.screen.hideComponent("botao-esconde");
	this.cronapi.screen.showComponent("botao-mostra");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.FiltrosHistoricoprecos.mostrarFiltros = function() {
	this.cronapi.screen.showComponent("crn-datasource-filter-general");
	this.cronapi.screen.showComponent("filtro-dataini");
	this.cronapi.screen.showComponent("filtro-datafim");
	this.cronapi.screen.showComponent("filtro-precomin");
	this.cronapi.screen.showComponent("filtro-precomax");
	this.cronapi.screen.showComponent("botao-busca");
	this.cronapi.screen.showComponent("botao-esconde");
	this.cronapi.screen.hideComponent("botao-mostra");
}
